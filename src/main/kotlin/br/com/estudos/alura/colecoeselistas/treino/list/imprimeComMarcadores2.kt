package br.com.estudos.alura.colecoeselistas.treino.list

fun List<Livro2?>.imprimeComMarcadores2() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "- ${it.titulo} de ${it.autor} publicado em ${it.anoPublicacao}"
        }
    println(" ### Lista de livros ### \n$textoFormatado\n")
}