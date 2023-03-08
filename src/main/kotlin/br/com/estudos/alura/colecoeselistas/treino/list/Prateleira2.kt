package br.com.estudos.alura.colecoeselistas.treino.list

data class Prateleira2(
    val genero: String,
    val livros: List<Livro2>
) {
    fun organizaPorAutor(): List<Livro2> {
        return livros.sortedBy { it.autor }

    }

    fun organizaPorAnoDePublicacao(): List<Livro2> {
        return livros.sortedBy { it.anoPublicacao }
    }

    fun organizaPorTitulo(): List<Livro2> {
        return livros.sortedBy { it.titulo }
    }
}