package br.com.estudos.alura.colecoeselistas.templates.arraydeobjetos

import java.math.BigDecimal


//Extension function:
/*Nesta aula, para calcular a soma do array de salários,
criamos uma extension function para os arrays do tipo BigDecimal,
utilizando a função reduce:*/

//Vai reduzir todo array a um valor através de soma
fun Array<BigDecimal>.somatoria(): BigDecimal {
    //Acumulador = acumula valores
    //Valor = Array que está sendo iterado
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}
/*
Possíveis outras formas de se resolver sem o extension:
1° Forma:
 var gastoInicio = BigDecimal.ZERO
    salariosComAumento.forEach { salario ->
       gastoInicio += salario
    }
    println(gastoInicio)

2° Forma:
   var gastoInicio = BigDecimal.ZERO
    for (salario in salariosComAumento) {
        gastoInicio += salario
    }
    println(gastoInicio)

 */


/*/vararg: Tipo especial kotlin
que possibilita passar argumentos variaveis em uma função */
fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array<BigDecimal>(values.size) { i ->
        values[i].toBigDecimal()
    }
}

/*/Aqui temos um grupo variável de variáveis que podemos
passar como parâmetro para essa função (Sem limitações quantitativas)*/


//Extension function:
/*Criamos, ainda, uma última extension function para os arrays do tipo BigDecimal
para calcular a média simples entre os valores do array:*/
fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()

    }
}