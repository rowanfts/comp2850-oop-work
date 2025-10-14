// Task 7.7.1: stats for a numeric dataset
fun main() {
    medianComp(readData())
}
fun readData() = buildList {
    while (true) {
        print("enter a number, or press ENTER when done: ")
        var input = readln()
        if (input.isEmpty()) {
            break
        }
        add(input.toFloat())
    }
}
fun medianComp(nums: List<Float>) {
    println(nums.sorted())
    if (nums.size %2 == 0) {
        println( (nums.sorted().get(nums.size/2) + nums.sorted().get((nums.size/2)-1))/2 )
    }
    else {
        println( nums.sorted().get(nums.size/2) )
    }    
}