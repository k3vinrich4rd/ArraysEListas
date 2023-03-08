package br.com.estudos.alura.colecoeselistas.templates.listas

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Capitães de Areia",
        autor = "Jorge Amado",
        anoDePublicacao = 1111,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Revolução dos bichos",
        autor = "Jorge Castro",
        anoDePublicacao = 1911
    ),

    Livro(
        titulo = "Piramide ",
        autor = "Jorge Amado",
        anoDePublicacao = 1834
    ),
    null,
    Livro(
        titulo = "Pai rico Pai pobre",
        autor = "Otário",
        anoDePublicacao = 1894,
        editora = "Editora B"

    )
)