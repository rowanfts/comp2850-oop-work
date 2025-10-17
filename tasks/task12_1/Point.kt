import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y) //!
}

fun main () {
    print("insert x value: ")
    val a = readln().toDouble()
    print("insert y value: ")
    val b = readln().toDouble()
    val p = Point(a,b)
    println("Distance from $a to $b is ${p.distance()}")
    val s = Point(4.5,7.0)
    println("Distance from 4.5 to 7.0 is ${s.distance()}")
}