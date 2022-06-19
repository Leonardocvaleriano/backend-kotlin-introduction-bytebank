package br.com.alura.bytebank.models

class Analyst(
    name: String,
    pps: String,
    salary: Double
) : Employee(
    name = name,
    pps = pps,
    salary = salary
) {

}