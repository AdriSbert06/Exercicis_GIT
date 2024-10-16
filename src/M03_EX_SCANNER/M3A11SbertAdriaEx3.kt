/**
 * Fes un programa que demani un número enter major que 1 a l'usuari i digui si el nombre és primer o no. Després, ens dirà quin és el nombre primer immediatament superior.
 * @author Adrià Sbert
 **/
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Escriu un número enter major que 1 i et diré si es primer (primo) o no: ")
    val num = scanner.nextInt()
    var numPrimer = true

    if (num < 2) {
        numPrimer = false
    } else {
        var i = 2
        while (i < num && numPrimer) {
            if (num % i == 0) {
                numPrimer = false
            }
            i++
        }
    }

    if (numPrimer) {
        println("$num és primer.")
    } else {
        println("$num no és primer.")
    }

    var proxNum = num + 1
    var proxPrimer = false

    while (!proxPrimer) {
        var i = 2
        proxPrimer = true
        while (i < proxNum && proxPrimer) {
            if (proxNum % i == 0) {
                proxPrimer = false
            }
            i++
        }
        if (proxPrimer) {
            println("El primer immediatament superior a $num és el $proxNum.")
        } else {
            proxNum++
        }
    }
}