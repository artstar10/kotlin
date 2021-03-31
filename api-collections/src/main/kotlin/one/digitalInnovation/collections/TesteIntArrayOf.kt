package one.digitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

        values.forEach {
            println(it)
        }

        println("=======forEach com sort() o sort ordena os números em ordem crescente===========")
        values.sort()
        values.forEach {
            println(it)
        }
}