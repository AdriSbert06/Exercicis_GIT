package M03_2

import java.util.Scanner

fun main(){
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = true
    var any: Int
    var mes: Int
    var dia: Int

    do {
        valorCorrecte =true
        println("Escriu la teva data de naixement de la següent forma: aa/mm/dd y seguint aquest ordre:")

        println("ANY:")
        any = lector.nextInt()
        println("MES:")
        mes = lector.nextInt()
        println("DIA:")
        dia = lector.nextInt()

        if (any < 1900 || any > 2024)
            println("ERROR!! No pots nèixer aquest any")

        if (mes < 1 || mes > 12)
            println("ERROR!! Aquest mes no existeix")

        if ( valorCorrecte) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
                println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                valorCorrecte = false

                }else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
                println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                valorCorrecte = false

                }else if ((mes ==2)  && (dia <1 || dia >28)) {
                    println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                    valorCorrecte = false

                }
        }
    }while (valorCorrecte == false)
}



