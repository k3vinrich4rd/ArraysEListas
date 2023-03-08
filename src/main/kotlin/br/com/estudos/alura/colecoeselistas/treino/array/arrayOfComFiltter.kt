package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(11, 43, 32, 18, 25, 13)
    val maioridade = ages.filter { it >= 18 }
    println("Maiores de idade: $maioridade")

    val menoridade = ages.filter { it < 18 }
    println("Menores idades: $menoridade")
}
