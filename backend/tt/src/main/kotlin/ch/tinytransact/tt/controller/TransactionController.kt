package ch.tinytransact.tt.controller

import ch.tinytransact.tt.model.Transaction
import ch.tinytransact.tt.service.TransactionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transactions")
class TransactionController(private val service: TransactionService) {

    @GetMapping("/all")
    fun getTransactions(): Collection<Transaction> = service.getTransactions()

    @GetMapping("/{id}")
    fun getTransactionById(@PathVariable id: Int): Transaction = service.getTransactionById(id)
}