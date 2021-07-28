package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("maria do carmo","000.555.444.02", 5000.00, "1234567")
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}