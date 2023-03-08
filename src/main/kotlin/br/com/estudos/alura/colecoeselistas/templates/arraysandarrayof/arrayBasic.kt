package br.com.estudos.alura.colecoeselistas.templates.arraysandarrayof

fun arrayBasic() {
    //Estrutura de if aninhados
    //Antes:
//    val firstAge = 25
//    val secondAge = 19
//    val thirdAge = 33
//    val fourAge = 20
//
//    val maiorIdade = if (firstAge > secondAge && firstAge > thirdAge && firstAge > fourAge) {
//        firstAge
//    } else if (secondAge > thirdAge && secondAge > fourAge) {
//        secondAge
//    } else if (thirdAge > fourAge) {
//        thirdAge
//    } else {
//        fourAge
//    }

//    println(maiorIdade)

    //Depois
    val ages = IntArray(5) //Declaração do array e seu tamanho
    ages[0] = 25
    ages[1] = 19
    ages[2] = 33
    ages[3] = 20
    ages[4] = 35


    var maiorIdade = 0
    for (age in ages) {
        when {
            age > maiorIdade
            -> maiorIdade = age
        }
    }
    println(maiorIdade)
}