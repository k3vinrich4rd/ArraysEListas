package br.com.estudos.alura.colecoeselistas.templates.listas

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        /* Estou usando a lista de livro, passando para o sortedBy,
        cria — se uma nova lista de livros ordenada por autor
        e retorna essa nova lista  */
        return livros.sortedBy { it.autor }

    }

    fun organizarPorAnoDePublicacao(): List<Livro> {

        return livros.sortedBy { it.anoDePublicacao }

        /* Outra forma de se fazer a mesma coisa:
        val livrosOrdenadosAnoPublicacao = livros.sortedBy { it.anoDePublicacao }
       return livrosOrdenadosAnoPublicacao */

        /* Estou usando a lista de livro, passando para o sortedBy,
            cria — se uma nova lista de livros ordenada por autor
            e retorna essa nova lista  */
        //  return livros.sortedBy { it.anoDePublicacao }
    }
}