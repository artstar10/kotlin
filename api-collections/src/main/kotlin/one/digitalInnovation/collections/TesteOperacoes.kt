package one.digitalInnovation.collections
/*filter filtra os salários maior que 2500*/
fun main() {
    println("====================\nSALÁRIOS DO SISTEMA")
    val salarios = doubleArrayOf(1000.0, 2250.0,4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("====================\nSALÁRIOS: MAIOR, MENOR E MÉDIA")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.00}
    println("========FILTER============\nIMPRENSÃO DE SALÁRIOS MAIOR QUE 2500")
    salariosMaiorQue2500.forEach { println(it) }
    println("========COUNT============\nSALÁRIOS ENTRE 2000 E 5000")
    println(salarios.count { it in  2000.0..5000.0 })

    println("=========FIND===========\nSALÁRIO IGUAL A 2250.0")
    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 500.0})

    println("=======ANY=============\nENCONTRAR SALARIO IGUAL A 1000.0 SE EXISTIR RETORNA TRUE")
    println(salarios.any { it == 1000.0})
    println(salarios.find { it == 500.0})
}