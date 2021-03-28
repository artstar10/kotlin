package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String  = "Arthur"
    var cpf: String = "113.333.444-99"
}

fun main(){
   val arthur = Pessoa()

   println(arthur.nome)
   println(arthur.cpf)
}