package br.com.alura.bytebank.models

class SalaryAccount(
    holder: Customer,
    accountNumber: Int
) : Account(holder = holder, accountNumber = accountNumber )