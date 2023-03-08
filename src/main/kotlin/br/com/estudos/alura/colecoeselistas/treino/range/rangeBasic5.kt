package br.com.estudos.alura.colecoeselistas.treino.range

fun main() {

    val intervalos = 1500.00..5000.00
    val salary = 3.0

    if (salary in intervalos) {
        println("Está dentro do intervalo")
    }
    println("Está fora")

    val alfabeto = 'a'..'z'
    when (val letra = 'y') {
        in alfabeto -> {
            println("A letra $letra faz parte do alfabeto")
        }

        else -> {
            println("A letra $letra está fora do alfabeto")
        }
    }
}
