// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) {"incorrect number of arguments"}    
    try {
        val fname = args[0]
        variance(readData(fname))
    }
    catch (error: Exception) {              // certain specific exceptions wont work
        println("something went wrong")     
        exitProcess(1)
    } 
}
