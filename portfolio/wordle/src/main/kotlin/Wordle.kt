// Implement the six required functions here
import java.io.File
import kotlin.random.Random

fun isValid(word: String): Boolean { //needs more functionalities
    if (word.length != 5) {
        println("ERROR: guess must have 5 letters")
        return false
    }
    return true
    //also check if input consists only of LETTERS and no numbers and symbols
} 

/* 
fun readWordList(filename: String): MutableList<String> { //not yet implemented
    //reads target words from file, returns them as list of strings
}
*/

fun pickRandomWord(words: MutableList<String>): String { //probably inefficient but works
    words.shuffle() //shuffle list once, grab first element every time
    val word = words[0]
    words.removeAt(0)
    for (i in words) {
        println(i)
    }
    return word
}

fun obtainGuess(attempt: Int): String { //complete!
    var guess = ""

    do {
        print("Attempt ${attempt}: ")
        guess = readln()
    } while (isValid(guess) == false)

    return guess
}

fun evaluateGuess(guess: String, target: String): List<Int> { //works but check it
    val result = MutableList<Int>(5) {0}
    for (i in 0..4) {
        if (guess[i].lowercase() == target[i].lowercase()) {
            result[i] = 1
        }
    }
    return result
}

fun displayGuess(guess: String, matches: List<Int>) { //works perfectly but double check it
    var wordSoFar = ""
    var i = 0
    while (i < 5) { //is there a neater way than a while loop?
        if (matches[i] == 1) {
            wordSoFar += guess[i]
        }
        else {
            wordSoFar += "?"
        }
        i += 1
    }
    println(wordSoFar)
}

fun main() {
    println("in main")
    val names = mutableListOf("Hello", "Hi", "Heya", "Good Evening")
    //println("word: ${pickRandomWord(names)}")
    //obtainGuess(3)
    //val result = evaluateGuess("hello","heyas")

    displayGuess("hello", evaluateGuess("hello","heyas"))
}