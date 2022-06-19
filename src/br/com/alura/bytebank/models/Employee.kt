package br.com.alura.bytebank.models

abstract class Employee(
    val name: String,
    val pps: String,
    val salary: Double
) {
    open var bonus: Double = salary * 0.1
        protected set
 }

