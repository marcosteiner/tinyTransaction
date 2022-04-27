package ch.tinytransact.tt.datasource.mock

import ch.tinytransact.tt.datasource.TransactionDataSource
import ch.tinytransact.tt.model.Transaction
import org.springframework.stereotype.Repository

@Repository
class MockTransactionDataSource : TransactionDataSource {
    val transactions = listOf(
        Transaction(1,"123","124", 2.0),
        Transaction(2,"123","127", 2.5),
        Transaction(3,"123","126", 2.6),
        Transaction(4,"123","125", 1.0)
    )

    override fun getTransactions(): Collection<Transaction> = transactions

    override fun getTransactionById(id: Int): Transaction = transactions.first { it.id == id }
}
