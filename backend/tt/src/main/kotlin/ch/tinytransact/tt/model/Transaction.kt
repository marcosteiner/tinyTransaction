package ch.tinytransact.tt.model

data class Transaction (
    val id: Int,
    val sender: String,
    val receiver: String,
    val amount: Double
)