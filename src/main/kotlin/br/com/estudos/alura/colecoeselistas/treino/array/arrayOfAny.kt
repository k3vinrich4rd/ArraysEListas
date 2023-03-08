package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(11, 16, 18, 23, 66, 70)
    val anyCondition = ages.any { it > 18 }
    println("Existe idade maior que 18? $anyCondition")

}