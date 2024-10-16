/**
 * @author: Adria Sbert
 */
fun main() {

    /*Algoritme d'una aplicació que demana un número i mostra per pantalla els números anterior i posterior a aquest.*/

    var num:Int

    println("Escriu un num qualsevol")

    num = readln(). toInt()

    println(num)

    println( "El numero posterior es: " + (num+1))
    println("El numero anterior es: " + (num-1))
}