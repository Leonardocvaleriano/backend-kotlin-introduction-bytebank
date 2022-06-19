package br.com.alura.bytebank.models

interface Authenticatable {
    fun authentic(password:String):Boolean

}