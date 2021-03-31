package one.digitalInnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    println("========for simples==========")
    for(valor in values) {
        println(valor)
    }

    println("========forEach==========")
    values.forEach { valor ->
        println(valor)
    }

    println("=======for com indice===========")
    for(index in values.indices){
        println(values[index])
    }

    println("=======for com sort() o sort ordena os números em ordem crescente===========")
    values.sort()
    for(valor in values){
        println(valor)
    }
}