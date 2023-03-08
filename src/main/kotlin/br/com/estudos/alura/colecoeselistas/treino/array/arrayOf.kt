package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = intArrayOf(11, 15, 27, 77, 21)

    ages.forEach { age ->
        print("$age ")
    }
    println()
    for (age in ages) {
        print("$age ")
    }

}
