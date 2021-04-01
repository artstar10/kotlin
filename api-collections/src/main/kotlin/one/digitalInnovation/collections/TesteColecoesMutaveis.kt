package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0,  "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("========= LIST =========")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("Pedro foi adicionado a funcionarios")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("João foi removido de funcionarios")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("========= SET - Foi Adicionado joão =========")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("========= ADD - Foi Adicionado Pedro =========")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("========= REMOVE - Foi removido Maria =========")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}