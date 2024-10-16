/**
 * @author: Adria Sbert
 */
fun main() {


//Algoritme que demana dos números i mostra el resultat de la suma, la resta, la multiplicació i la divisió d'ells dos.

var num1:Int
var num2:Int

println("Necesito que hem diguis dos numeros i et mostrare la resta, suma, multiplicacio i divisio")

println("Ara escriu el primer numero:")
num1 = readln().toInt()

println("Ara escriu el segon numero:")
num2 = readln().toInt()

println("La suma dels dos numeros es: " + (num1 +num2))
println("La resta dels dos numeros es:" +(num1-num2))
println("La multiplicacio dels dos numeros es:" +(num1*num2))
println("La divisio dels dos numeros es:"+ (num1/num2))
}