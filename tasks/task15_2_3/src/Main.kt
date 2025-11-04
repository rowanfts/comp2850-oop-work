// Task 15.2.3

fun main() {
    // Write your main program here
    val myAccount = SavingsAccount("Rowan", 0.018)
    myAccount.deposit(1250)
    repeat(5) {
        myAccount.applyInterest()
    } 
    myAccount.withdraw(50)
    println("Final Balance: ${myAccount.balance}")
}
