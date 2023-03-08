package br.com.estudos.alura.colecoeselistas.templates.arraysandarrayof

fun forEach() {
    //Tira a necessidade de ficar alterando o tamanho do array
    //Pois, se quiser aumentar a idade, baste somente acrescentar um número no parâmetro
    val ages: IntArray = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = Int.MIN_VALUE //Uma constante que tem o menor valor possível de int
    for (age in ages) {
        if (age > maiorIdade) {
            maiorIdade = age
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE //Uma constante que tem o maior valor possível de int
    ages.forEach { age ->
        if (age < menorIdade) {
            menorIdade = age
        }
    }
    println(menorIdade)
}