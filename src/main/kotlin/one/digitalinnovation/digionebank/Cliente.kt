package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.test.TesteAutenticacao

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String

): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "senha123" == senha
    override fun toString(): String = """
        Nome: $nome
        cpf: $cpf
        clienteTipo: ${clienteTipo.descricao}
    """.trimIndent()
}