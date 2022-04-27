package ch.tinytransact.tt.model

data class Transaction (
    val sender: String,
    val receiver: String,
    val amount: Double
)