package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista

fun main(){
    val joao = Analista(nome = "João", cpf = "11111111111", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}