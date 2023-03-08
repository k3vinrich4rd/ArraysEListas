package br.com.estudos.alura.colecoeselistas.treino.list

fun main() {
    livrosComAtributoNulo
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro2>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}