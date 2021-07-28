package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val joao = Cliente("Joao Carlos", "000.000.00-75", ClienteTipo.Pf, "senha123")

    println(joao)
    TesteAutenticacao().autentica(joao)
}