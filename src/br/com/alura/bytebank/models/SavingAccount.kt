package br.com.alura.bytebank.models

class SavingAccount(
    holder: Customer,
    accountNumber: Int
) : AccountTransfer(holder = holder, accountNumber = accountNumber)