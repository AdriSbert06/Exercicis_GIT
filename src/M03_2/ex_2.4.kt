package M03_2
/**
 * @author: Adrià Sbert
 */

fun main() {

//Algoritme que demana una nota entre 0 i 10, i mostra si és un suspès (0-4), un suficient (5), un bé (6), un notable (7-8) o un excel·lent (9-10).
    do{
        println("Escriu la teva nota entre el 0 i el 10")
        var nota: Double= readln().toDouble()
        if (nota >10 || nota <0)
            println("ERROR!! Es un número entre el 0 i 10!! Torna a intentar.")
        if (nota <5 && nota >=0)
            println("Oh, has suspès..:(")
        if (nota >=5 && nota <6)
            println("Felicitats, justet però suficient!")
        if (nota >=6 && nota <7)
            println("Felicitats, tens un bé!")
        if (nota >=7 && nota <9)
            println("Felicitats, tens un notable! :)")
        if (nota >=9 && nota <=10)
            println("Molt bé, has tret un excel·lent!!")
    }while (nota>10 || nota <0)

}
