package ch.tinytransact.tt.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class TransactionControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc


    @Test
    fun `should return all transactions`() {
        mockMvc.get("/transactions/all")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                jsonPath("$[0].sender"){ value("123") }
            }
    }

    @Test
    fun `should return transaction with id 1`() {
        mockMvc.get("/transactions/1")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                jsonPath("$.id"){ value("1") }
            }
    }
}