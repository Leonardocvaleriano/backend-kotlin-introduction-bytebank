package br.com.alura.bytebank.models

class Calculator {

    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        total += employee.bonus

    }
}






