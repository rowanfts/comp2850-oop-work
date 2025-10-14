// Task 7.7.1: stats for a numeric dataset
fun main() {
    val nums = readData()
    val median = medianComp(nums)
    displayStats(nums, median)
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

fun medianComp(nums: List<Float>) : Float {
    var median: Float
    if (nums.size %2 == 0) {
        median = (nums.sorted().get(nums.size/2) + nums.sorted().get((nums.size/2)-1))/2 
    }
    else {
        median = nums.sorted().get(nums.size/2) 
    }    

    return median
}

fun displayStats(nums: List<Float>, median: Float) {
    val minimum = nums.min() 
    val maximum = nums.max()
    val mean = nums.average() 

    println(nums.sorted())
    println("mean: $mean")
    println("median: $median")
    println("minimum: $minimum")
    println("maximum: $maximum")
}