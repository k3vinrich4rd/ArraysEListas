package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {

    val ages = IntArray(5)
    ages[0] = 18
    ages[1] = 20
    ages[2] = 24
    ages[3] = 21
    ages[4] = 15

    var maiorIdade = 0
    var menorIdade = Int.MAX_VALUE

    for (age in ages) {
        if (age > maiorIdade) {
            maiorIdade = age
        }
    }
    println("Maior Idade: $maiorIdade")

    ages.forEach { age ->
        if (age < menorIdade) {
            menorIdade = age
        }
    }
    println("Menor Idade: $menorIdade")
}
