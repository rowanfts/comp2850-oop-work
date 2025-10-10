// Task 5.1.1: anagram checking using a function
import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Annagram Checker.")

    print("Please enter the 1st word: ")
    val arg0 = readln()
    print("Please enter the 2nd word: ")
    val arg1 = readln()

    if (arg0 anagramOf arg1) {
        println("$arg0 and $arg1 are anagrams!")
    }
    else {
        println("$arg0 and $arg1 are not anagrams!")
    }
}

infix fun String.anagramOf(str:String): Boolean{
    if (this.length != str.length) {
        return false
    }
    val thisChars = this.lowercase().toList().sorted()
    val strChars = str.lowercase().toList().sorted()
    return thisChars == strChars
}