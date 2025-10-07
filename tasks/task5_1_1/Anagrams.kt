// Task 5.1.1: anagram checking using a function
import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Annagram Checker.")
    println("Please enter the 1st word: ")
    val arg0 = readln()
    println("Please enter the 2nd word: ")
    val arg1 = readln()

    when (anagrams(arg0, arg1)) {
        true -> println("The words '$arg0' and '$arg1' are annagrams!")
        false -> println("The words '$arg0' and '$arg1' are not annagrams!")
    }
}

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}
