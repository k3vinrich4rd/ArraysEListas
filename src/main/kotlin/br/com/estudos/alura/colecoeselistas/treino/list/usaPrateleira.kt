package br.com.estudos.alura.colecoeselistas.treino.list

fun main() {
    val prateleira = Prateleira2(genero = "terror", livros = livrosComAtributoNulo)
    val porAutor = prateleira.organizaPorAutor()
    val porAnoPublicacao = prateleira.organizaPorAnoDePublicacao()
    val porTitulo = prateleira.organizaPorTitulo()


    porAutor.imprimeComMarcadores2()
    porAnoPublicacao.imprimeComMarcadores2()
    porTitulo.imprimeComMarcadores2()
}