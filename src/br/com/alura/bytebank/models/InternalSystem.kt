package br.com.alura.bytebank.models

class InternalSystem {

    fun enter(admin: Authenticatable, password: String) {
        if (admin.authentic(password)) {
            println("Welcome to bytebank")
        } else {
            println("Failed to authenticable")
        }
    }
}