// Task 3.1: command line arguments
fun main(args: Array<String>) {
    if (args.size == 2) {
    	println(args[0])
    	println(args[1])
    }
    else {
        exitProcess(1)
    }
} 