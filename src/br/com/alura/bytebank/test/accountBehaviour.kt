import br.com.alura.bytebank.models.*

fun accountBehaviour() {



    val checkingAccont = CheckingAccount(
        Customer(
            name = "Leonardo",
            pps = "55555-ff",
            password = "123",
            Address(
                primaryAddress = "rua missions",
                postalCode = 1235,
                city = "Sao paulo",
                country = "Brazil"
            )
        ), accountNumber = 1000
    )

    val savingAccount = SavingAccount(
        Customer(
            name = "Paulo",
            pps = "77777-GG",
            password = "1234",
            address = Address(
                postalCode = 2326266,
                primaryAddress = "dona tecla",
                city = "Guarulhos",
                country = "Brazil"
            )
        ), accountNumber = 1001
    )

    val salaryAccount = SalaryAccount(
        Customer(
            name = "Lucas",
            pps = "4405557-FF",
            password = "12345",
        ), accountNumber = 1002
    )

    println("Total Accounts: $totalAccounts")


    println()
    println("Holder: ${checkingAccont.holder.name}")
    println("PPS: ${checkingAccont.holder.pps}")
    println("Account Number: ${checkingAccont.accountNumber}")
    println("Balance: ${checkingAccont.balance}")
    println("Address")
    println("Primary Adress: ${checkingAccont.holder.address.primaryAddress}")
    println("City: ${checkingAccont.holder.address.postalCode}")
    println("Country: ${checkingAccont.holder.address.country}")
    println("City: ${checkingAccont.holder.address.city}")
    println()

    println("Performing the deposit...")
    checkingAccont.deposit(300.00)
    println("Current balance: ${checkingAccont.balance} ")
    println()

    println("Performing transfer to ${savingAccount.holder.name}...")
    checkingAccont.transfer(200.00, savingAccount)
    println("Current balance: ${savingAccount.balance} ")
    println()

    println("** Welcome to Byte Bank **")
    println()
    println("Holder: ${savingAccount.holder.name}")
    println("PPS: ${savingAccount.holder.pps}")
    println("Packages.Account Number: ${savingAccount.accountNumber}")
    println("Balance: ${savingAccount.balance}")
    println("Address:")
    println("Primary Adress: ${savingAccount.holder.address.primaryAddress}")
    println("City: ${savingAccount.holder.address.postalCode}")
    println("Country: ${savingAccount.holder.address.country}")
    println("City: ${savingAccount.holder.address.city}")
    println()

    println("Performing withdraw...")
    savingAccount.withdraw(30.00)
    println("Current Balance: ${savingAccount.balance}")
    println()

    println("Performing transfer to ${salaryAccount.holder.name}")
    savingAccount.transfer(20.00, salaryAccount)
    println("Current Balance: ${savingAccount.balance}")
    println()

    println("** Welcome to Byte Bank **")
    println()
    println("Holder: ${salaryAccount.holder.name}")
    println("PPS: ${salaryAccount.holder.pps}")
    println("Account Number: ${salaryAccount.accountNumber}")
    println("Balance: ${salaryAccount.balance}")
    println()

    println("Performing the deposit...")
    salaryAccount.deposit(100.00)
    println("Current balance: ${salaryAccount.balance}")
    println()


}