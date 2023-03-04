package templates.arraydeobjetos

import java.math.BigDecimal
import java.math.RoundingMode

/*
Regra de negócio
/Todo funcionário tem ter um aumento de 10%
o mínimo 500R$
 */

fun arrayDeObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    /*
    Estamos pegando salários e mapeando cada salário para um salário vez um aumento
    e convertendo para um array de volta (pois um map, retorna uma lista)
     */
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }.toTypedArray()
    println(salariosComAumento.contentToString())
}

/*
/vararg: Tipo especial kotlin
que possibilita passar argumentos variaveis em uma função
 */



fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array<BigDecimal>(values.size) { i ->
        values[i].toBigDecimal()
    }
}


/*
/Aqui temos um grupo variável de variáveis que podemos
passar como parâmetro para essa função (Sem limitações quantitativas)
 */