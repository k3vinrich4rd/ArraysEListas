package br.com.estudos.alura.colecoeselistas.treino.list


val listaDeLivrosComNulos: MutableList<Livro2?> = mutableListOf(
    null,
    Livro2(
        titulo = "Capitães de Areia",
        autor = "Jorge Amado",
        anoPublicacao = 1111,
        editora = "Editora A"
    ),

    null,
    Livro2(
        titulo = "Revolução dos bichos",
        autor = "Jorge Castro",
        anoPublicacao = 1911
    ),

    Livro2(
        titulo = "Piramide ",
        autor = "Jorge Amado",
        anoPublicacao = 1834
    ),

    null,
    Livro2(
        titulo = "Pai rico Pai pobre",
        autor = "Otário",
        anoPublicacao = 1894,
        editora = "Editora B"

    )
)