package br.com.estudos.alura.colecoeselistas.test.lista

import br.com.estudos.alura.colecoeselistas.templates.listas.Prateleira
import br.com.estudos.alura.colecoeselistas.templates.listas.imprimeComMarcadoresPrateleira
import br.com.estudos.alura.colecoeselistas.templates.listas.listaDeLivros

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAutor = prateleira.organizarPorAutor()
    val porAnoDePublicacao = prateleira.organizarPorAnoDePublicacao()

    //Estão apontando para objetos diferentes
    porAutor.imprimeComMarcadoresPrateleira()
    porAnoDePublicacao.imprimeComMarcadoresPrateleira()

    prateleira.imprimeComMarcadoresPrateleira()


}