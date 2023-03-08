package br.com.estudos.alura.colecoeselistas.treino.list

fun main() {

    val livro1 = Livro2(
        titulo = "Capitães de Areia",
        autor = "Jorge Amado",
        anoPublicacao = 1111,
        editora = "Editora A"
    )

    val livro2 = Livro2(
        titulo = "Revolução dos bichos",
        autor = "Jorge Castro",
        anoPublicacao = 1911
    )

    val livro3 = Livro2(
        titulo = "Piramide ",
        autor = "Jorge Amado",
        anoPublicacao = 1834
    )

    val livro4 = Livro2(
        titulo = "Pai rico Pai pobre",
        autor = "Otário",
        anoPublicacao = 1894,
        editora = "Editora B"

    )

    val listaDeLivros: MutableList<Livro2> = mutableListOf(livro1, livro2, livro3, livro4)

    //como adicionar valores a essa lista
    listaDeLivros.add(
        Livro2(
            titulo = "Revolução dos bichos",
            autor = "George Orwell",
            anoPublicacao = 1945
        )
    )

    listaDeLivros.imprimeComMarcadores2()
    listaDeLivros.remove(livro3)
    listaDeLivros.imprimeComMarcadores2()

    println("Ordenação por ano de publicação:")
    val ordenacaoAnoPublicacao = listaDeLivros.sorted()
    ordenacaoAnoPublicacao.imprimeComMarcadores2()

    println("Ordenação por titulo: ")
    val ordenacaoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenacaoPorTitulo.imprimeComMarcadores2()

    println("Ordenação por autor: ")
    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores2()

    println("Para filtrar e ordenar por autor:")
    listaDeLivros.filter { it.autor == "Jorge Amado" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores2()


    println("Para filtrar a partir de uma letra")
    listaDeLivros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores2()

    println("Para filtrar, mapear, ordenar e mapear(Titulos): ")
    val titulos = listaDeLivros.filter { it.autor == "Jorge Amado" }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)


}