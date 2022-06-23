package br.com.alura.bytebank.models

var totalAccounts = 0
    private set

abstract class Account(
    val holder: Customer,
    val accountNumber: Int

) {

    var balance: Double = 0.0
        protected set

    init {
        totalAccounts++
    }

    fun deposit(value: Double) {
        if (value > 0.0) {
            balance += value
            println("Operation performed successfully.")
            println("Value: $value")
        } else {
            println("Operation failed")
        }
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
            println("Withdraw successful")
            println("Value: $value")
        } else {
            println("Failed withdraw")
        }
    }
}


class SalaryAccount(
    holder: Customer,
    accountNumber: Int
) : Account(holder = holder,
    accountNumber = accountNumber)

class CheckingAccount(
    holder: Customer,
    accountNumber: Int
) : AccountTransfer(holder = holder, accountNumber = accountNumber)



class SavingAccount(
    holder: Customer,
    accountNumber: Int
) : AccountTransfer(holder = holder, accountNumber = accountNumber)
