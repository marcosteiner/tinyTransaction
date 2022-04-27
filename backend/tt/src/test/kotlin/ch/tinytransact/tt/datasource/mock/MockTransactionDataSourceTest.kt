package ch.tinytransact.tt.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockTransactionDataSourceTest {
   private val mockDatasource = MockTransactionDataSource()

    @Test
    fun `should provide a list of transactions`() {
        val transactions = mockDatasource.getTransactions()

        assertThat(transactions).isNotEmpty
    }

    @Test
    fun `should provide correct mock data`() {
        val transactions = mockDatasource.getTransactions()

        assertThat(transactions).allMatch { it.sender.isNotBlank() }
        assertThat(transactions).allMatch { it.receiver.isNotBlank() }
        assertThat(transactions).allMatch { it.amount != 0.0 }
        assertThat(transactions).allMatch { it.amount > 0.0 }
    }

}