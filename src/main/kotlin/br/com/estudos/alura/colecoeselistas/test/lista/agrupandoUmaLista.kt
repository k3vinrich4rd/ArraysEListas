package br.com.estudos.alura.colecoeselistas.test.lista

import br.com.estudos.alura.colecoeselistas.templates.listas.Livro
import br.com.estudos.alura.colecoeselistas.templates.listas.listaDeLivros

fun main() {
    listaDeLivros
        //Para imprimir o livro separado por editora:
        //groupBy → Espera uma função que diga qual elemento vamos usar para agrupar a lista
        //(Agrupar por)
        .groupBy { it.editora ?: "Editora desconhecida" } //Vai ser a chave do agrupamento
        //groupBy vai retornar um mapa de K para list T
        //Vai ter um objeto com uma chave que vai apontar para uma lista de T
        //Para cada editora temos uma lista que faz parte dessa editora
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
            //Estou agrupando a lista de livros por editora
            //O groupBy retorna um elemento contento uma chave, que no caso é a editora
            //E um valor que é a lista de livros da determinada editora (não é a lista inteira
        }
}