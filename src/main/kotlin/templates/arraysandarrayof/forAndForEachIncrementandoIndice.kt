package templates.arraysandarrayof

fun forAndForEachIncrementandoIndice() {
    val salarios: DoubleArray = doubleArrayOf(1500.00, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    for (i in salarios.indices) {
        salarios[i] *= aumento
    }
    println(salarios.contentToString())

    /*
O forEachIndexed funciona da seguinte forma: para cada elemento do array,
executamos a função passada nele para cada valor do array e seu respectivo index.
 */
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}