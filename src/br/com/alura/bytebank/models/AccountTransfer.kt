package br.com.alura.bytebank.models

open class AccountTransfer(
    holder: Customer,
    accountNumber:Int
) : Account(
    holder = holder ,
    accountNumber = accountNumber

) {
    fun transfer(value: Double, accountDestiny: Account):Boolean {
        if (balance >= value) {
            balance-= value
            accountDestiny.deposit(value)
           return true
        } else {
            println("insufficient funds, operation failed. ")
            return false

        }

    }


}