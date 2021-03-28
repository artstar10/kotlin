package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria do Carmo", cpf = "11111111111", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
