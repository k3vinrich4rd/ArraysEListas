package br.com.estudos.alura.colecoeselistas.treino.array

fun main() {
    val alturas = DoubleArray(5)

    alturas[0] = 1.65
    alturas[1] = 1.70
    alturas[2] = 1.80
    alturas[3] = 1.55
    alturas[4] = 1.73


    var maiorAltura = 0.0
    for (altura in alturas) {
        if (altura > maiorAltura) {
            maiorAltura = altura
        }
    }
    println("Maior Altura: $maiorAltura")


    var menorAltura = Double.MAX_VALUE
    for (altura in alturas) {
        if (altura < menorAltura) {
            menorAltura = altura
        }
    }
    println("Menor Altura: $menorAltura")

}