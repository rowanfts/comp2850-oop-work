// Task 13.3

data class Money(val euros: Int, val cents: Int) {
    init {
        require(cents <= 99) { "cents must be below 99" }
        require(cents >= 0) { "cents must be above 0" }
        require(euros >= 0) { "euros must be above 0" }
    }
    operator fun plus(other: Money) = Money(euros + other.euros, cents + other.cents)
}
