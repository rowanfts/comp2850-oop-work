import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

// Don't need tests for obtainGuess() or displayGuess() !!!

@Suppress("unused")
class WordleTest : StringSpec({
    "Word length of 5" {
        withClue("length=5") { isValid("hello") shouldBe true }
        withClue("length=4") { isValid("heya") shouldBe false }
        withClue("length=6") { isValid("hellos") shouldBe false }
    }
})
