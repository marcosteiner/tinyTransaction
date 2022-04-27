package ch.tinytransact.tt.service

import ch.tinytransact.tt.datasource.TransactionDataSource
import ch.tinytransact.tt.model.Transaction
import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionDataSource: TransactionDataSource) {
    fun getTransactions(): Collection<Transaction> = transactionDataSource.getTransactions()
    fun getTransactionById(id: Int): Transaction {
        return transactionDataSource.getTransactionById(id)
    }
}