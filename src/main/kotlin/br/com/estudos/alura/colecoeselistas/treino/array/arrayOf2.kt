package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {

    val alturas = doubleArrayOf(1.77, 1.65, 1.80, 1.55, 1.90)


    var maiorAltura = Double.MIN_VALUE
    var menorAltura = Double.MAX_VALUE

    for (altura in alturas) {
        if (altura > maiorAltura) {
            maiorAltura = altura
        }
    }
    println("Maior altura: $maiorAltura")

    alturas.forEach { altura ->
        if (altura < menorAltura) {
            menorAltura = altura
        }
    }
    println("Menor Altura: $menorAltura")
}