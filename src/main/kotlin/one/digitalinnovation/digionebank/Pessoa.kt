package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Liosvaldo"
    var cpf: String = "000.000.000-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome $cpf"
}

fun main(){
    val liosvaldo = Pessoa()
    println(liosvaldo.pessoaInfo())
}