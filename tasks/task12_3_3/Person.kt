// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth)) 
    var isMarried = false
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}
fun main () {
    print("Enter your name: ")
    val userName = readln()
    print("\nEnter your date of birth (YYYY-MM-DD): ")
    val userDate = readln()

    val p = Person(userName, userDate)

    println(p.name)
    println(p.birth)
}