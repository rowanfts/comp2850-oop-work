// Implement the six required functions here
import java.io.File
import kotlin.random.Random
import kotlin.system.exitProcess

const val WORD_LENGTH = 5

fun isValid(word: String): Boolean {
    // Reject if word does not contain 5 letters
    if (word.length != WORD_LENGTH || !word.all { it.isLetter() }) {
        println("ERROR: Guess must contain $WORD_LENGTH letters.")
        return false
    }
    return true
}

fun readWordList(filename: String): MutableList<String> {
    val file = File(filename)
    // Exit if file is empty or nonexistent
    if (!file.exists() || file.readLines().isEmpty()) {
        println("ERROR: Invalid file.")
        exitProcess(1)
    }
    return file.readLines().toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String {
    // Pick a random index
    val index = Random.nextInt(words.size)
    // Remove and return word at index
    val word = words[index]
    words.removeAt(index)
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
