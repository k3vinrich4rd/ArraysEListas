package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val ages = IntArray(5)

    ages[0] = 10
    ages[1] = 17
    ages[2] = 16
    ages[3] = 15
    ages[4] = 21

    //Iterando com for
    for (age in ages) {
        print("$age ")
    }
    println()

    //Iterando com ForEach
    ages.forEach { age ->
        print("$age ")
    }

}