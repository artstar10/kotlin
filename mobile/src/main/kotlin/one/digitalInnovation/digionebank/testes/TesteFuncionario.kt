package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val arthur = Pessoa(nome = "Arthur Neves", cpf = "11111111111")
    println(arthur.nome)
    println(arthur.cpf)

    val joao = Funcionario(nome = "Arthur Neves", cpf = "11111111111", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}