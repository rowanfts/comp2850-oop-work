import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // Testing isValid(word: String): Boolean
    "Validity of different word lengths" {
        withClue("length=5") { isValid("hello") shouldBe true }
        withClue("length=4") { isValid("heya") shouldBe false }
        withClue("length=6") { isValid("hellos") shouldBe false }
    }
    "Validity of different word contents" {
        withClue("all letters") { isValid("hello") shouldBe true }
        withClue("one capital") { isValid("Hello") shouldBe true }
        withClue("all capital") { isValid("HELLO") shouldBe true }
        withClue("one number") { isValid("h3llo") shouldBe false }
        withClue("all numbers") { isValid("12345") shouldBe false }
        withClue("one symbol") { isValid("h@llo") shouldBe false }
        withClue("all symbols") { isValid("!@#$%") shouldBe false }
        withClue("one blank") { isValid("h llo") shouldBe false }
        withClue("all blank") { isValid("     ") shouldBe false }
    }

    // Testing pickRandomWord(words: MutableList<String>): String
    "Selection of word from list" {
        withClue("length=one") { pickRandomWord(mutableListOf("HELLO")) shouldBe "HELLO" }
    }

    // Testing readWordList(filename: String): MutableList<String>
    "Opening and reading file to list" {
        withClue("existing word") { readWordList("data/words.txt").contains("ABACK") shouldBe true }
        withClue("nonexisting word") { readWordList("data/words.txt").contains("ABARK") shouldBe false }
    }

    // Testing evaluateGuess(guess: String, target: String): List<Int>
    "Comparison of different guesses & targets" {
        withClue("different word") { evaluateGuess("XXXXX", "HELLO") shouldBe listOf(0, 0, 0, 0, 0) }
        withClue("same word") { evaluateGuess("HELLO", "HELLO") shouldBe listOf(2, 2, 2, 2, 2) }
        withClue("first letter not in word") { evaluateGuess("XELLO", "HELLO") shouldBe listOf(0, 2, 2, 2, 2) }
        withClue("last letter not in word") { evaluateGuess("HELLX", "HELLO") shouldBe listOf(2, 2, 2, 2, 0) }
        withClue("incorrect position correct letters") {
            evaluateGuess("OELLH", "HELLO") shouldBe listOf(1, 2, 2, 2, 1)
        }
        withClue("incorrect position incorrect letters") {
            evaluateGuess("OXXXH", "HELLO") shouldBe listOf(1, 0, 0, 0, 1)
        }
    }
})
