package one.digitalInnovation.collections

fun main() {
    /*criado 3 funcionários */
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)
    /* funcionario guardados na variavel funcionarios*/
    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("==retorno do nome da maria==")
    println(funcionarios.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
    }
