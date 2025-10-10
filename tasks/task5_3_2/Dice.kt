// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun main(){
    rollDice()              //1d6
    rollDice(sides=20)      //1d20
    rollDice(many=4)        //4d6
    rollDice(12,2)          //2d12
}

fun rollDice(sides:Int=6, many:Int=1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling ${many}d$sides...")
        var result = 0
        for (i in 1..many) {
            result += Random.nextInt(1, sides + 1)
        }
        println("You rolled $result\n")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
