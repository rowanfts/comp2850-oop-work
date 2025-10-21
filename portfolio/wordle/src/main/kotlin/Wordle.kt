// Implement the six required functions here
import java.io.File

//DO I NEED HEADER COMMENT DOCSTRINGS?

fun isValid(word: String): Boolean {
    if (word.length != 5) {                 // Checks guess length (must be 5)
        println("ERROR: Guess must have a length of 5.")
        return false
    }
    for (char in word) {                    // Checks guess contents (must be letters only)
        if (!char.isLetter()) {
            println("ERROR: Guess must only include letters.")
            return false
        }
    }
    return true
} 

fun readWordList(filename: String): MutableList<String>  = File(filename).useLines { it.toMutableList() } //complete!

fun pickRandomWord(words: MutableList<String>): String { //probably inefficient but works
    words.shuffle() //shuffle list once, grab first element every time
    val word = words[0]
    words.removeAt(0)
    for (i in words) {
        println(i)
    }
    println(words)
    return word
}

fun obtainGuess(attempt: Int): String { 
    var guess = ""

    do {
        print("Attempt ${attempt}: ")
        guess = readln()
    } while (isValid(guess) == false)       // Repeatedly prompts if guess invalid

    return guess.uppercase()
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = MutableList<Int>(5) {0}    // Initialize all characters as 0
    for (i in 0..4) {
        if (guess[i] == target[i]) {        // Set correctly guessed as 1
            result[i] = 1
        }
    }
    return result
}


fun displayGuess(guess: String, matches: List<Int>) {
    var output = ""
    for (i in 0..4) {
        if (matches[i] == 1) {              // Case 1: Correct guess
            output += guess[i]
        } else {                            // Case 2: Incorrect guess
            output += "?"
        }
    }
    println(output)
}