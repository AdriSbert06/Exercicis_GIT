package M03_EX_SCANNER

import java.util.*

fun main(){
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean
    var any: Int
    var mes: Int
    var dia: Int

    do {
        valorCorrecte = true
        println("Escriu la teva data de naixement de la següent forma: aa/mm/dd")

        println("ANY:")
        x = lector.nextInt()
        println("MES:")
        mes = lector.nextInt()
        println("DIA:")
        dia = lector.nextInt()

        // Validació de l'any
        if (x < 1900 || x > 2024) {
            println("ERROR!! No pots nèixer aquest any")
            valorCorrecte = false

        }

        // Validació del mes
        if (mes < 1 || mes > 12) {
            println("ERROR!! Aquest mes no existeix")
            valorCorrecte = false
        }

        // Validació del dia segons el mes
        if (valorCorrecte) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
                println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                valorCorrecte = false
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
                println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                valorCorrecte = false
            } else if (mes == 2) {
                val esAnyBisiest = (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)
                if (esAnyBisiest && (dia < 1 || dia > 29) || !esAnyBisiest && (dia < 1 || dia > 28)) {
                    println("ERROR!! Aquest dia no és vàlid per al mes $mes")
                    valorCorrecte = false
                }
            }
        }
    } while (!valorCorrecte)

// Determinar el signe zodiacal
    val signe = when {
        (mes == 1 && dia >= 20) || (mes == 2 && dia <= 18) -> "Aquari"
        (mes == 2 && dia >= 19) || (mes == 3 && dia <= 20) -> "Peixos"
        (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) -> "Àries"
        (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) -> "Taure"
        (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) -> "Gèminis"
        (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) -> "Càncer"
        (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) -> "Lleó"
        (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) -> "Verge"
        (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) -> "Balança"
        (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) -> "Escorpí"
        (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) -> "Sagitari"
        (mes == 12 && dia >= 22) || (mes == 1 && dia <= 19) -> "Capricorn"
        else -> "Data no vàlida"
    }

    println("El teu signe zodiacal és: $signe")

}