// Task 4.5: summing odd integers with a for loop
fun main(args: Array<String>) {
    print("Input upper limit: ")
    val lim = readln().toInt()
    var sum = 0
    for (i in 1..lim step 2){
		sum = sum + i
    }
    println(sum)
}

// program could use some error catching