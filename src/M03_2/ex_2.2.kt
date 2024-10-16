package M03_2

/**
 * @author Adrià Sbert
 */

fun main() {
    //Algoritme que demana un número entre 0 i 10, i dona error si és menor de 0 o major de 10.

    do{
        println("Escriu un número entre el 0 i el 10")
        var num= readln().toInt()
        if (num >10 || num <0)
            println("ERROR!! Es un número entre el 0 i 10!! Torna a intentar.")

    }while (num>10 || num <0)
        println("OK!")
}