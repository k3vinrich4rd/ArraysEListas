package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(23, 33, 45, 81)
    val all = ages.all { it > 18 }
    println("Todas as pessoas na listas atingiram a maioridade? $all")
}