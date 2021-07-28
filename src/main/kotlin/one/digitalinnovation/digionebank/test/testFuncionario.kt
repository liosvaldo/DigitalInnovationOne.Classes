package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val liosvaldo = Funcionario("Liosvaldo", "000-000-000.00", BigDecimal.valueOf(1000))
    println(liosvaldo.nome)
    println(liosvaldo.cpf)
    println(liosvaldo.salario)

}