fun main() {
    val myAccount = BankAccount("Abdulrahman Magdey")

    myAccount.deposit(10000)


    val firstWithdrawl = myAccount.withdraw(5000)
    println("is Withdraw success : $firstWithdrawl and balance after this transaction is ${myAccount.getBalance()}!")

    val secondWithdrawl = myAccount.withdraw(3000)
    println("is Withdraw success : $secondWithdrawl and balance after this transaction is ${myAccount.getBalance()}!")
}