package br.com.estudos.alura.colecoeselistas.treino.list

data class Livro2(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro2> {
    /* Como ordenar essa lista implementando a interface Comparable: */
    //Quando é implementado o comparable,
    // estamos dando uma ordenação natural a classe (o uso não é muito legal)
    //Nesses casos é mais interessante usar o sortedBy (classificado por)
    override fun compareTo(other: Livro2): Int {

        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}