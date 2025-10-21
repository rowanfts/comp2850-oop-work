// Implement the six required functions here
import java.io.File

const val WORD_LENGTH = 5

fun isValid(word: String): Boolean {
    if (word.length != WORD_LENGTH || !word.all { it.isLetter() }) {
        println("ERROR: Guess must contain 5 letters.")
        return false
    }
    return true
}

fun readWordList(filename: String): MutableList<String> = File(filename).useLines { it.toMutableList() }

// NOTE TO SELF: Ask if its ok for it to be a little inefficient
fun pickRandomWord(words: MutableList<String>): String {
    // Randomize order of words list
    words.shuffle()
    // Remove and Return first word
    val word = words[0]
    words.removeAt(0)
    return word
}

fun obtainGuess(attempt: Int): String {
    var guess = ""
    // Repeatedly prompt user if invalid guess
    do {
        print("Attempt $attempt: ")
        guess = readln()
    } while (isValid(guess) == false)
    return guess.uppercase()
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    // 0 Incorrect, 1 Different location, 2 Correct
    val result = MutableList<Int>(WORD_LENGTH) { 0 }
    for (i in 0..(WORD_LENGTH - 1)) {
        if (guess[i] == target[i]) {
            result[i] = 2
        }
        else if (guess[i] in target) {
            result[i] = 1
        }
    }
    return result
}

fun displayGuess(guess: String, matches: List<Int>) {
    // Define colours
    val green = "\u001b[32m"
    val yellow = "\u001b[33m"
    val reset = "\u001b[0m"

    var output = ""
    for (i in 0..(WORD_LENGTH - 1)) {
        if (matches[i] == 2) { // Case 1: Correct guess
            output += green + guess[i] + reset
        }
        else if (matches[i] == 1) { // Case 2: Correct guess, incorrect placement
            output += yellow + guess[i] + reset
        }
        else { // Case 3: Incorrect Guess
            output += "?"
        }
    }
    println(output)
}
