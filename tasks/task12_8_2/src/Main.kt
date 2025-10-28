// Task 12.8.2: program to manipulate playing cards

fun main() {
    val deck = mutableListOf<Card>()
    for (i in Rank.entries) {
        for (j in Suit.entries) {
            deck.add(Card(i,j))
        }
    }
    val newDeck = deck.shuffled()
    for (card in newDeck) {
        println(card.fullName())
    }
}
