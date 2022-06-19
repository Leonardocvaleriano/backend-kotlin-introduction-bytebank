package br.com.alura.bytebank.models

open class EmployeeAuthenticatable(
    name: String,
    pps: String,
    salary: Double,
    private val password: String
) : Employee(
    name = name,
    pps = pps,
    salary = salary
), Authenticatable {

    override fun authentic(password: String): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }


}