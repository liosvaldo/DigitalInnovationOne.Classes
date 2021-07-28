package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.ClienteTipo

fun  main(){
    ClienteTipo.values().iterator().forEach {
        println("${it.name} $it")
    }

}