package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Cliente
import one.digitalInnovation.digionebank.ClienteTipo

fun main(){
    val jose  = Cliente(
        nome = "José da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}

