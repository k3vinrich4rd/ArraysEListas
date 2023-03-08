package br.com.estudos.alura.colecoeselistas.templates.arraysandarrayof

fun arrayOf() {
    //Tira a necessidade de ficar alterando o tamanho do array
    val ages: IntArray = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = 0
    for (age in ages) {
        when {
            age > maiorIdade
            -> maiorIdade = age
        }
    }
    println(maiorIdade)
}