package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String  = "Arthur"

    var cpf: String = "113.333.444-99"
    private set
}

fun main(){
   val arthur = Pessoa()

    println(arthur)
    println(arthur.nome)
    println(arthur.cpf)
}