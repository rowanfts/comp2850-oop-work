// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) {"incorrect number of arguments"}    
    try {
        val fname = args[0]
        variance(readData(fname))
    }
    catch (error: IndexOutOfBoundsException) {              
        println("index is out of bounds")     
        exitProcess(1)
    } 
    catch (error: IllegalArgumentException) {
        println("argument is illegal")
        exitProcess(1)
    }
    catch (eror: FileNotFoundException) {
        println("file not found")
        exitProcess(1)
    }
}
