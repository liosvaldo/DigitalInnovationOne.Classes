package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Liosvaldo"
    var cpf: String = "000.000.000-00"
}

fun main(){
    val liosvaldo = Pessoa()

    println(liosvaldo.nome)
    println(liosvaldo.cpf)
}