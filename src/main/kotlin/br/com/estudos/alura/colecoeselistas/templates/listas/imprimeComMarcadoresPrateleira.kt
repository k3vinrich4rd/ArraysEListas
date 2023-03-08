package br.com.estudos.alura.colecoeselistas.templates.listas

//Vai continuar funcionando para as MutableList
//Mutablelist é de um tipo List: fun MutableList<Livro>.imprimeComMarcadores() (antes)
/*Para visualizar melhor as alterações na lista de livros,
fizemos uma função para imprimir a lista formatada com marcadores
indicando cada título e o autor do livro*/
fun List<Livro?>.imprimeComMarcadoresPrateleira() { //(Depois)
    //joinToString = Juntar para string
    //Recebe cada elemento da lista e nos possiblita decidir como imprimir cada elemento
    val textoFormatado = this //Se refere
        //Representa a lista de livros
        .filterNotNull() //Isso vai filtrar os livros nulos na lista
        //Impossibilitando o log. de impressão
        .joinToString(separator = "\n") {
            "- ${it.titulo} de ${it.autor} publicado em ${it.anoDePublicacao}"
        }
    println(" ### lista de livros ### \n$textoFormatado\n")

}

fun Prateleira.imprimeComMarcadoresPrateleira() {
    val generoLiterario = this.genero
    val textoFormatado = livros.joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor} publicado em ${it.anoDePublicacao}  editora: ${it.editora ?: "Editora desconhecida"} "

    }
    println(
        " ### Prateleira de Livros ###\n \nGênero Literário: $generoLiterario\n" +
                "Livros: \n$textoFormatado"
    )


}