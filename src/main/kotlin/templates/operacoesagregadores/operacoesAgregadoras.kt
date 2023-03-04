package templates.operacoesagregadores

fun operacoesAgregadoras() {

    val ages = intArrayOf(10, 12, 18, 33, 40, 67)
    var maiorIdade = ages.maxOrNull()
    var menorIdade = ages.minOrNull()
    println("Maior idade usando max(): $maiorIdade")


    //Outra forma de fazer a mesma coisa (Maior Idade)
    for (age in ages) {
        when {
            age > maiorIdade!!
            -> maiorIdade = age
        }
    }
    println("Maior idade usando for: $maiorIdade")

    //Outra forma de fazer a mesma coisa(Maior Idade)
    ages.forEach { age ->
        age > maiorIdade!!
        maiorIdade = age
    }
    println("Maior idade usando forEach: $maiorIdade\n")


    println("Menor idade utilizando min() $menorIdade")

    for (age in ages) {
        when {
            age < menorIdade!!
            -> menorIdade = age
        }
    }
    println("Menor idade utilizando for: $menorIdade")


    ages.forEach { age ->
        if (age < menorIdade!!) {
            menorIdade = age
        }
    }
    println("Menor idade utilizando forEach: $menorIdade\n")

    println("Media de idades:")
    //Para saber a média de idades dos alunos em um colégio:
    val media = ages.average()
    println("Média de idades dos alunos: $media\n")


    println("Verifica se todas as idades é maior ou igual a 18:")
    //Para verificar se todas as idades informadas atingiu a maioridade
    val maioridade = ages.all { it >= 18 }
    println("Todos os alunos atingiram a maioridade: $maioridade\n")

    println("Verifica se pelo menos uma idade é maior ou igual a de 18: ")
    //Para verificar se pelo menos umas das idades atingiu a maioridade:
    //vai retornar true se pelo menos um dos valores satisfazer a condição 
    val sePeloMenosUmEMaior = ages.any { it >= 18 }
    println("Algum aluno é maior de idade: $sePeloMenosUmEMaior\n")

    //Para filtrar somente quem for maior de idade 
    println("Filtra somente quem for maior ou menor de idade: ")
    val filterMaioresDeIdade = ages.filter { it >= 18 }
    val filterMenoresDeIdade = ages.filter { it < 18 }
    println("Maiores de idade: $filterMaioresDeIdade ")
    println("Menores de idade: $filterMenoresDeIdade\n ")

    println("Para filtrar um valor específico: ")
    //Para filtrar valores específicos
    val buscaEspecifica = ages.find { it < 18 } //Retorna o primeiro valor que satisfaz o esperado
    println("Busca específica: $buscaEspecifica")

}