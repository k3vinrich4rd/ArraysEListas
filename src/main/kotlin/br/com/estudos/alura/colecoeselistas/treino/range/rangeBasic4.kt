package br.com.estudos.alura.colecoeselistas.treino.range

fun main() {

    val numerosDecrescentes = 100 downTo 2 step 2
    numerosDecrescentes.forEach { numeroDecrescente ->
        println(numeroDecrescente)
    }
}