import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "Word length of 5" {
        withClue("length=5") {isValid("hello") shouldBe true}
        withClue("length=4") {isValud("heya") shouldBe false}
        withClue("length=6") {isValud("hellos") shouldBe false}
    }
})
