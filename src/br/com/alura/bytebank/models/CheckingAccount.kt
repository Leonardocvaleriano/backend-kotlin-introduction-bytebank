package br.com.alura.bytebank.models

class CheckingAccount(
    holder: Customer,
    accountNumber:Int
) : AccountTransfer(holder = holder,  accountNumber = accountNumber )