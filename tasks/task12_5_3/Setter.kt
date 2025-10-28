// Task 12.5.3: class with a custom setter

import java.time.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
    set(value) {    //NOTE: does not check when first creating obj
        require(value.isNotBlank()) { "Name cannot be blank" }
        field = value
    }
}

fun main() {
    val date = LocalDate.of(2005, 7, 1)
    val p = Person("Rowan", date)
    p.name = ""
    println(p.name)
}
