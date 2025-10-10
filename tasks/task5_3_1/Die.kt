// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun main() {
    print("Hit enter to roll a d6. \nOtherwise, insert a number corresponding to the dice you would like to roll: ")
    val num = readln()
    if (num == "") {
        rollDie()
    }
    else {
        rollDie(num.toInt())
    }
}

fun rollDie(sides: Int=6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
