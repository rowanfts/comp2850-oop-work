// Task 12.5.2: class with a custom getter

import java.time.LocalDate

class Person(_name: String, val birth: LocalDate) {

   var isMarried = false

   var name = _name
       get() {
           return field.uppercase()
       }
}

fun main() {
    val date = LocalDate.of(2005, 7, 1)
    val p = Person("Rowan", date)
    println(p.name)
}
