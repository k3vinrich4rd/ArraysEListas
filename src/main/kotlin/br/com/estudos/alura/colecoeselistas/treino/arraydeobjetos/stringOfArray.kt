package br.com.estudos.alura.colecoeselistas.treino.arraydeobjetos

fun main() {
    val names = stringArrayOf("Kevin", "Vilma", "Carlos", "Ketelyn", "Murilo", "Ted", "Snoop")

    when (val name = "Kevin") {
        in names -> {
            println("$name está dentro da lista de nomes")
        }

        else -> {
            println("Name está fora da lista de names")
        }
    }

}

fun stringArrayOf(vararg values: String): Array<String> {
    return Array<String>(values.size) { i ->
        values[i]
    }
}