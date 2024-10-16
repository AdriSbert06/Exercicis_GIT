/**
 * @author: Adria Sbert
 */
fun main () {

//Algoritme que demana una distància en metres i mostra per pantalla la conversió a milles marines.

    var metres: Float

    println("Donem una distància en metres per convertir-la en milles marines")

    metres = readln().toFloat()

    println("La conversió de " + metres + " metres a milles nautiques es: " + (metres * 0.00053996)+" milles nautiques")

}