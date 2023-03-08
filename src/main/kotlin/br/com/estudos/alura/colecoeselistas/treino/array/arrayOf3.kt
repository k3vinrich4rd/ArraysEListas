package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {

    val ages = intArrayOf(33, 22, 11, 15, 18)

    var maiorIdade = Int.MIN_VALUE
    var menorIdade = Int.MAX_VALUE

    for (age in ages) {
        if (age > maiorIdade) {
            maiorIdade = age
        }
    }
    println("Maior idade: $maiorIdade")

    ages.forEach { age ->
        if (age < menorIdade) {
            menorIdade = age
        }
    }
    println("Menor idade: $menorIdade")
}