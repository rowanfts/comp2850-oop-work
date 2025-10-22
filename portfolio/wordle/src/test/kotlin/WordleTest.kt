import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
// import java.io.File

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
    "Selection of random word from list" {
        withClue("length=1") { pickRandomWord(mutableListOf("HELLO")) shouldBe "HELLO" }
        /*withClue("length=3") {
            val temp = mutableListOf("HELLO", "HIIII", "HEYAS")
            (pickRandomWord(temp) in temp) shouldBe true
        }*/
    }

    // Testing readWordList(filename: String): MutableList<String>
    // Testing evaluateGuess(guess: String, target: String): List<Int>
    "Comparison of different guesses & targets" {
        withClue("same word") { evaluateGuess("HELLO", "HELLO") shouldBe listOf(2, 2, 2, 2, 2) }
        withClue("first letter not in word") { evaluateGuess("XELLO", "HELLO") shouldBe listOf(0, 2, 2, 2, 2) }
        withClue("last letter not in word") { evaluateGuess("HELLX", "HELLO") shouldBe listOf(2, 2, 2, 2, 0) }
        withClue("incorrect position correct letters") {
            evaluateGuess("OELLH", "HELLO") shouldBe listOf(1, 2, 2, 2, 1)
        }
        withClue("incorrect position incorrect letters") {
            evaluateGuess("OXXXH", "HELLO") shouldBe listOf(1, 0, 0, 0, 1)
        }
        withClue("different word") { evaluateGuess("XXXXX", "HELLO") shouldBe listOf(0, 0, 0, 0, 0) }
    }
})
