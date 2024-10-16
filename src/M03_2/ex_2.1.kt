package M03_2

/**
 * @author Adrià Sbert
 */

fun main() {

    //Algoritme que demana l'edat, i mostra missatges diferents en funció de si s'és major d'edat o menor.


    do {
        println("Escriu la teva edat")
        var edat = readln().toInt()

        if (edat > 0)
            if (edat < 18)
            println("Ets menor d'edat, menys jocs i més estudiar")
        if (edat >= 18)
        println("Ja ets tot un adult, a treballar!!")

            if (edat < 0)
            println("Això es impossible!! Escriu la teva edat real!!")


    } while (edat < 0)


}







