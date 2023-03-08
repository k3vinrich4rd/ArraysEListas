package br.com.estudos.alura.colecoeselistas.templates.arraydeobjetos

import java.math.BigDecimal

fun arrayGeneric() {
    //Array generic
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    //usar ‘string’ é melhor para converter porque o double tem problemas de arredondamento
    salarios[0] = "1500.55".toBigDecimal() //Converte o valor para bigDecimal
    salarios[1] = "2000.0".toBigDecimal()
    println(salarios.contentToString())
}