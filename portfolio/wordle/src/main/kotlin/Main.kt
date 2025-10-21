const val ATTEMPTS = 6

fun main() {
    println("\nWelcome to Wordle!")
    println("Enter a 5 letter word to begin.")
    // Initialize list of words
    val words = readWordList("data/words.txt")
    // Select word to guess
    val target = pickRandomWord(words)
    // Run game
    for (attempt in 1..ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val resultBinary = evaluateGuess(guess, target)
        displayGuess(guess, resultBinary)
        // Check end conditions
        if (resultBinary == listOf(2, 2, 2, 2, 2)) {
            println("Congratulations! You've found the word.")
            break
        }
        else if (attempt == ATTEMPTS) {
            println("Out of attempts. \nThe word was $target.")
        }
    }
}
