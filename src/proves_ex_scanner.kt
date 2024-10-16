import java.util.Scanner

fun main(){
    val x: Int
    val lector:Scanner= Scanner(System.`in`)
    var valorCorrecte: Boolean = false

    do{
        println("ewe")
        valorCorrecte = lector.hasNextInt()
        if(valorCorrecte == false){
            println("ERROR!!")
        }
    }while (valorCorrecte==false)
    x = lector.nextInt()
    println("Has escrit el numero $x")


}
