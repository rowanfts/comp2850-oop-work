// Task 12.8.1: example of an enum class
import kotlin.system.exitProcess

enum class Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

fun main() {
    println(Day.entries)
    print("Enter a day of the week: ")

    try {    
        val input = readln()
        val day = Day.valueOf(input)
    }
    catch (error: IllegalArgumentException) {
        println("Input must match a day of the week exactly.")
        exitProcess(1)
    }
}