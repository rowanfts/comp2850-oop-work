// Task 13.3

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : StringSpec({
    "Can create a Money" {
        val m = Money(1, 50)
        withClue("euros") { m.euros shouldBe 1 }
        withClue("cents") { m.cents shouldBe 50 }
    }
    "Cannot create invalid Money" { 
        withClue("negative euros") { shouldThrow<IllegalArgumentException> { Money(-1, 50) } }
        withClue("negative cents") { shouldThrow<IllegalArgumentException> { Money(1, -50) } }
        withClue("more than 99 cents") { shouldThrow<IllegalArgumentException> { Money(1, 100) }}
    }
    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
    }
    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }
    /*
    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    } 
    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }*/
})
