// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun main() {
    rollDie(readInt("Insert a number corresponding to the dice you would like to roll: "))
}

fun readInt(prompt: String): Int {
    print(prompt)
    val sides = readln().toInt()
    return sides
}

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
