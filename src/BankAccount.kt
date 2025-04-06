import java.util.UUID

class BankAccount(
    val fullName: String
) {
    val accountID: UUID = UUID.randomUUID()
    private var balance = 0
    private val transactions: MutableList<Int> = mutableListOf()

    fun deposit(amount: Int) {
        balance += amount
        transactions.add(amount)
    }

    fun withdraw(amount: Int): Boolean {
        if (amount <= balance) {
            balance -= amount
            transactions.add(-amount)
            return true
        } else {
            return false
        }
    }

    fun getBalance(): Int {
        return transactions.sum()
    }

    fun getDetailedTransactions() {
        transactions.forEachIndexed { index, item ->
            if (item > 0)
                println("Tranaction (${index + 1}) - Deposited: $item LE")
            else
                println("Tranaction (${index + 1}) - Withdraw: ${-item} LE")
        }
    }
}