package M03_2

/**
 * @author: Adrià Sbert
 */

fun main() {
    //Algoritme que demana una nota entre 0 i 10, i mostra si és un aprovat o un suspès.
    do{
        println("Escriu la teva nota entre el 0 i el 10")
        var nota= readln().toInt()
        if (nota >10 || nota <0)
            println("ERROR!! Es un número entre el 0 i 10!! Torna a intentar.")
        if (nota <5 && nota >0)
            println("Oh, has suspès..:(")
        if (nota >=5 && nota <10)
            println("Felicitats, has aprovat! :)")
    }while (nota>10 || nota <0)


}