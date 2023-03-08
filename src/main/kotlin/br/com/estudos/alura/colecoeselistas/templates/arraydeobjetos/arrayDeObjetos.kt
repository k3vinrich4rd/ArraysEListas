package br.com.estudos.alura.colecoeselistas.templates.arraydeobjetos

import java.math.BigDecimal
import java.math.RoundingMode

/*Regra de negócio
/Todo funcionário tem ter um aumento de 10%
o mínimo 500R$*/

fun arrayDeObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    /*Estamos pegando salários e mapeando cada salário para um salário vez um aumento
    e convertendo para um array de volta (pois um map, retorna uma lista)*/
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Valores somados após o aumento e gasto inicial: $gastoInicial")

    //Fold = Dobrar
    //Recebe um valor inicial
    /*Utilizamos a função fold() para calcular a soma dos salários com aumento pelos próximos
    6 meses, utilizando o retorno da função somatória como gasto inicial:  */
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gastos com os funcionários nesse mês e nos próximos 6 meses: $gastoTotal")

    //Antes
//    //Retorna uma lista com todos os aumentos do menor para o maior(Crescente)
//    val salariosOrdenados = salariosComAumento.sorted()
//    println("Três salários mais caros da lista: $salariosOrdenados")
//
//    //takeLast = pegar o último
//    //takeLast retorna uma lista
//    val tresUltimosSalarios = salariosOrdenados.takeLast(3).toTypedArray()
//    val mediaTresUltimosSalarios = tresUltimosSalarios.media().setScale(2, RoundingMode.UP)


    //Depois:
    //Fazendo dessa forma o código fica bem mais limpo
    /*E compondo algumas funções diferentes, nós calculamos
    a média dos 3 maiores e dos 3 menores salários: */
    val mediaDosTresSalariosMaisAltos = salariosComAumento.sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
        .setScale(2, RoundingMode.UP)

    println("Média dos três salários mais altos da lista: $mediaDosTresSalariosMaisAltos")

    val mediaDosTresSalariosMaisBaixos = salariosComAumento.sorted()
        .take(3)
        .toTypedArray()
        .media()
        .setScale(2, RoundingMode.UP)

    println("Média dos três menores salários da lista: $mediaDosTresSalariosMaisBaixos\n")

}


private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }