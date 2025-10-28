// Task 12.5.4: class with a computed property

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main() {
    val date = LocalDate.of(2005, 7, 1)
    val p = Person("Rowan", date)
    println("${p.name} born ${p.birth} is ${p.age} years old.")
}
