package br.com.estudos.alura.colecoeselistas.treino.range

fun main() {
    val numerosPares = 0.until(100) step 2
    numerosPares.forEach { numeroPar ->
        println(numeroPar)
    }
}
