// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    constructor(birth: String): this(LocalDate.parse(birth)) // Somnething's wrong
}
fun main () {
    val date = LocalDate.of(2005, 7, 1)
    val p = Person("Rowan", "2005-07-01")
    println(p.name)
    println(p.birth)
}