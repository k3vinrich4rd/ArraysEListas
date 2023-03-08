package br.com.estudos.alura.colecoeselistas.templates.ranges

fun ranges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    //Outra forma de fazer essa interação
    for (i in 1..10) {
        println(i)
    }
    println()

    //Para imprimir númerosPares
    val numerosPares = 0.until(100) step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    val numerosDecrescentes = 100 downTo 2 step 2
    numerosDecrescentes.forEach { print("$it ") }
    println()

    //Para verificar se um número está dentro de um intervalo
    val intervalo = 1500.00..5000.00
    val salary = 3.0

    if (salary in intervalo) {
        println("Esta dentro do intervalo")
    }
    println("Não está dentro do intervalo")
    println()

    //Para verificar se uma letra está dentro de um intervalo
    val alfabeto = 'a'..'z'
    when (val letra = '9') {
        in alfabeto -> println("$letra faz parte do alfabeto")
        else -> println("$letra não é uma letra")
    }
}