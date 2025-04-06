import java.util.UUID

class BankAccount(
    val fullName: String
) {
    val accountID: UUID = UUID.randomUUID()
    private var balance = 0

    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int): Boolean {
        if (amount <= balance) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun getBalance(): Int {
        return balance
    }
}