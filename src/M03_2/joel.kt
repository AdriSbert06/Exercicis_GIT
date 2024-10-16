package M03_2
import java.util.Scanner

fun main() {
    val lector: Scanner = Scanner(System.`in`)
    val num1: Int = lector.nextInt()
    val num2: Int = lector.nextInt()
    val num3: Int = lector.nextInt()

    when {
        (num1 > num2 && num1 > num3) -> {
            println("Jiden")
        }
        (num2 > num1 && num2 > num3) -> {
            println("Drump")
        }
        (num3 > num1 && num3 > num2) -> {
            println("Banders")
        }
    }
}
