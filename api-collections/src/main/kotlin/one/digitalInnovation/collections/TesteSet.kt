package one.digitalInnovation.collections

fun main() {
    /*aqui foi instanciado 3 funcionario*/
    val joao = Funcionario("João", 2000.0,  "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
    /*aqui foi colocado em dois conjuntos funcionarios1 e funcionarios2*/
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    /*imprime o relatorio final unindo funcionarios1 com funcionarios2*/
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("relatório dos com subtracao")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("relatório dos com intersect")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}




















