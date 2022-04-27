package ch.tinytransact.tt.service

import ch.tinytransact.tt.datasource.TransactionDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {
    private val transactionDataSource: TransactionDataSource = mockk(relaxed = true)
    private val transactionService = TransactionService(transactionDataSource)

    @Test
    fun `should call datasource`() {
        transactionService.getTransactions()
        verify(exactly = 1) { transactionDataSource.getTransactions() }
    }

}