package br.com.alura.bytebank.models

class Manager(
    name: String,
    pps: String,
    password: String,
    salary: Double
) : EmployeeAuthenticatable(
    name = name,
    pps = pps,
    password = password,
    salary = salary
) {

}