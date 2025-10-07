// Task 5.2.1: geometric properties of circles
import kotlin.math.PI
fun main() {
    val radius = readDouble("Insert the radius size: ")
    println("Perimeter: " + circlePerimeter(radius))        // how to display 4 decimals only?
    println("Area: " + circleArea(radius))                  // format and printf cause errors...
}
fun circlePerimeter(radius: Double) = 2 * PI * radius
fun circleArea(radius: Double) = PI * radius * radius
fun readDouble(prompt: String): Double {
    print(prompt)
    return readln().toDouble()
}