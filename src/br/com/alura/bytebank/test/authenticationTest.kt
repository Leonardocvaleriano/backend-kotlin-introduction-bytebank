import br.com.alura.bytebank.models.Director
import br.com.alura.bytebank.models.InternalSystem

fun authenticationTest() {

    val margarethe = Director(
        name = "Margarethe",
        pps = "5525789-FF",
        salary = 5.500,
        password = "1234"
    )


    val system = InternalSystem()
    system.enter(margarethe, "1234")


}