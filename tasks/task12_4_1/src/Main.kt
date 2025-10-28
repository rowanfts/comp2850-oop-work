// Task 12.4.1: main program

fun main() {
    val pt1 = Point(2.5, 5.0)
    val pt2 = Point(2.0, 5.0)
    val circ = Circle(pt1, 1.0)
    if (circ contains pt2) {
        println("point is in circle!")
    } else {
        println("point is not in circle!")
    }
}