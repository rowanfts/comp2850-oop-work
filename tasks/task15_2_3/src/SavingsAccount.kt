// Task 15.2.3

// Implement SavingsAccount class here
class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    fun applyInterest() {
        var interest = (balance * rate).toInt()
        this.deposit(interest)
    }
}
