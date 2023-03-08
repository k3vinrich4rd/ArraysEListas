
package br.com.estudos.alura.colecoeselistas.templates.listas

/*/Cria automaticamente em runtime (tempo de execução):
toString, equals, toHash e etc */
data class Livro(
    val titulo: String,
    val autor: String,
    val anoDePublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {
    /* Como ordenar essa lista implementando a interface Comparable: */
    //Quando é implementado o comparable,
    // estamos dando uma ordenação natural a classe (o uso não é muito legal)
    //Nesses casos é mais interessante usar o sortedBy (classificado por)
    override fun compareTo(other: Livro): Int {

        return this.anoDePublicacao.compareTo(other.anoDePublicacao)
    }
}