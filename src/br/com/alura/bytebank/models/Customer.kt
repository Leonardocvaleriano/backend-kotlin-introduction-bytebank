package br.com.alura.bytebank.models

class Customer(
    val name: String,
    val pps: String,
    val password: String,
    var address: Address = Address()
    ): Authenticatable {

     override fun authentic(password: String): Boolean {
        if (this.password == password) {
            println("Login successful")
            return true
        } else {
            println("Login Failed")
            return false
        }
    }
}