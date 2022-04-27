package ch.tinytransact.tt.datasource

import ch.tinytransact.tt.model.Transaction

interface TransactionDataSource {
    fun getTransactions(): Collection<Transaction>
}