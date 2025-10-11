// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    val len0 = ""
    val len1 = "x"
    val len2 = "xx"
    val str1 = "abc"
    val str2 = "cba"
    val str3 = "Abc"
    val str4 = "BCA"

    "Two strings of different lengths are not anagrams"{
        withClue(" & x") {len0.anagramOf(len1) shouldBe false}
        withClue("x & ") {len1.anagramOf(len0) shouldBe false}
        withClue("x & xx") {len1.anagramOf(len2) shouldBe false}
    }
    
    "An empty string is not an anagram of itself"{
        len0.anagramOf(len0) shouldBe false
    }

    "A non-empty string is an anagram of itself"{
        len1.anagramOf(len1) shouldBe true
    }

    "Two strings are anagrams if they contain the same characters in a different order" {
        str1.anagramOf(str2) shouldBe true
    }

    "Letter case is disregarded when comparing character sequences" {
        withClue("abc & Abc") {str1.anagramOf(str3) shouldBe true}
        withClue("abc & BCA") {str1.anagramOf(str4) shouldBe true}
    }
})
