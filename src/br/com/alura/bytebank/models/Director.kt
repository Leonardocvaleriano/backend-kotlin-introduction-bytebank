package br.com.alura.bytebank.models

class Director(
    name: String,
    pps: String,
    password: String,
    salary:Double
) : EmployeeAuthenticatable(
    name = name,
    pps = pps,
    password = password,
    salary = salary
) {

    val plr:Double get() = salary * 100



}