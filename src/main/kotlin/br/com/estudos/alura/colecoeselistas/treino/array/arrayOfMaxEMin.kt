package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(11, 15, 18, 21, 44, 50)
    var maiorIdade = ages.maxOrNull()
    var menorIdade = ages.minOrNull()

    println("Maior idade da lista $maiorIdade")
    println("Menor idade da lista $menorIdade\n")

    for (age in ages) {
        if (age > maiorIdade!!) {
            maiorIdade = age
        }
    }
    println("Maior idade da lista $maiorIdade")

    ages.forEach { age ->
        if (age < menorIdade!!) {
            menorIdade = age
        }
    }
    println("Menor idade da lista $menorIdade")
}