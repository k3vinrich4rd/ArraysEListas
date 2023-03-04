package templates.operacoesagregadores

fun main() {

    val ages = intArrayOf(10, 15, 20, 11, 16, 27)
    val maioridade = 18

    for (age in ages) {
        if (age < maioridade) {
            println("Alunos menores de idade: $age")

        } else {
            println("Alunos maiores de idade: $age")
        }
    }
    println()

    //Outra forma de fazer:
    val filterMaioresDeIdade = ages.filter { it >= 18 }
    val filterMenoresDeIdade = ages.filter { it < 18 }
    println("Maiores de idade: $filterMaioresDeIdade")
    println("Menores de idade: $filterMenoresDeIdade")
}