/**
 * @author: Adria Sbert
 */
fun main () {

//Algoritme que demana una distància en metres i mostra per pantalla la conversió a milles marines.

    var metre: Float

    println("Donem una distància en metres per convertir-la en milles marines")

    metre = readln().toFloat()

    println("La conversió de " + metre + " metres a milles nautiques es: " + (metre * 0.00053996)+" milles nautiques")

    var milles: Float
    println("Escriu una distància en milles marines ")

    milles = readln().toFloat()

    println("La conversió de " +milles+ " milles nautiques a metres es: "+ (milles/0.00053996)+" metres")
}