package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(25, 33, 11, 12, 15, 21, 18)
    val findAges = ages.find { it > 10 }
    println(findAges) //Retorna o primeiro valor que encontrar
}