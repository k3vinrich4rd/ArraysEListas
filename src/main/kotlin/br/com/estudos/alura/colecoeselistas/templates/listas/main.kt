package br.com.estudos.alura.colecoeselistas.templates.listas


fun main() {
    val livro1 = Livro(
        titulo = "Capitães de Areia",
        autor = "Jorge Amado",
        anoDePublicacao = 1111,
        editora = "Editora A"
    )

    val livro2 = Livro(
        titulo = "Revolução dos bichos",
        autor = "Jorge Castro",
        anoDePublicacao = 1911
    )

    val livro3 = Livro(
        titulo = "Piramide ",
        autor = "Jorge Amado",
        anoDePublicacao = 1834
    )

    val livro4 = Livro(
        titulo = "Pai rico Pai pobre",
        autor = "Otário",
        anoDePublicacao = 1894,
        editora = "Editora B"

    )

    //Generic = "< >" para criar listas de qualquer tipo
    //Como criar uma lista mutável
    /* Construímos a lista com os livros criados.
    Fazemos isso de uma forma bem parecida com a criação de arrays, ou seja,
    chamamos uma função construtora passando os livros como argumento:*/
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    //como adicionar valores a essa lista
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoDePublicacao = 1946
        )

    )

    livros.imprimeComMarcadoresPrateleira()
    livros.removeAt(4)
    livros.imprimeComMarcadoresPrateleira()

    //Como ordenar uma lista:
    println("Ordenação por ano de publicação:")
    val ordenacaoAnoPublicacao: List<Livro> = livros.sorted() //Retorna um list de tipo livro (Uma lista imutável)
    ordenacaoAnoPublicacao.imprimeComMarcadoresPrateleira() //Então para chamarmos essa função temos que mudar para List também


    println("Ordenação por título")
    val ordenacaoPorTitulo = livros.sortedBy { it.titulo } //sortedBy = Classificar por
    ordenacaoPorTitulo.imprimeComMarcadoresPrateleira()


    /*
    Ainda no mesmo tema, vimos uma forma mais simples de ordenar
    que não depende da implementação de nenhuma ‘interface’
     utilizando a função sortedBy: */
    //Ordenação por autor:
    println("Ordenação por autor")
    livros.sortedBy { it.autor }.imprimeComMarcadoresPrateleira()


    //Como filtrar uma lista:
    //E order por ano de publicação
    println("Filtro por autor e ordenação por ano de publicação:")
    listaDeLivros.filter { it.autor == "Silvio Almeida" } //filter = filtro (Retorna uma lista)
        .sortedBy { it.anoDePublicacao }
        .imprimeComMarcadoresPrateleira()

    //startsWith: (Que inicie com)
    //Aqui está filtrando a partir de todo autor que a inicial do nome é 'J'
    //E organizando através do ano de publicação
    println("Filter que inicia com uma e inicial e ordenação por ano de publicação: ")
    listaDeLivros.filter { it.autor.startsWith("J") }  //startsWith: Que inicie com
        .sortedBy { it.anoDePublicacao }
        .imprimeComMarcadoresPrateleira()

    /*Juntando todos esses conceitos, nós
  chegamos a uma função para filtrar a lista de livros
  pelo nome do autor, ordená-la pelo ano de publicação e transformá-la em
  uma lista de títulos:*/

    println("Filtro, Ordenação e Mapeamento (Que retorna outra lista(Com somente os titulos):")
    val titulos: List<String> = listaDeLivros.filter { it.autor == "José de Alencar" }
        .sortedBy { it.anoDePublicacao }
        .map { it.titulo } //Retorna outra list
    println(titulos) //não utilizo o imprimi com marcadores porque só quero o titulo
    //E não o objeto por completo


}