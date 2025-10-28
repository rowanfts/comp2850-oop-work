// Task 12.8.2: class to represent playing cards

class Card(val rank: Rank, val suit: Suit) {
    fun fullName() = "${rank.name} of ${suit.name}"
    override fun toString() = "${rank.toString()}${suit.toString()}"
}