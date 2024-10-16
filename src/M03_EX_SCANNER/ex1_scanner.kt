package M03_EX_SCANNER

import java.util.IllegalFormatException
import java.util.Scanner

/**
 * @author: Adrià Sbert
 */
fun main() {

    println("MENU " +
        "Que vols fer?" +
                "\n\t 1. Programa signe zodiac" +
                "\n\t 2. Propietats dels triangles" +
                "\n\t 3. Número" +
                "\n\t 4. Dos nombres enters" +
                "\n\t 5. Calculadora" +
                "\n\t 0. Surt."
    )
    val exercici = Scanner(System.`in`)
    val valor: Int

    do {
        when (exercici) {

            1 -> { // Escriu un programa que llegeixi una data de naixement i ens digui el signe zodiacal corresponent. Has d’assegurar-te que l’usuari introdueix una data de naixement correcta.

                var dd: Int
                var mm: Int
                var aa: Int

                println("Escriu la teva data de naixement de la següent forma: dd/mm/aa y seguint aquest ordre:")
                  do{
                      "\n\t DIA: "
                              if (dd > 0 && dd <= 31)
                                  println("DIA: $dd")
                              else (
                                  println("ERROR!! Aquest valor no existeix")
                              )
                  }while (dd <0 && dd >31)

                        else
                    "\n\t MES: " +
                        if (mm >= 1 && mm <= 12)
                            println("MES: $mm")


                "\n\t ANY:"

            }

/*

            2 -> { // Escriu un programa que presenti el següent menú d’opcions relacionades amb les propietats dels triangles i que permeti resoldre les operacions indicades.


            }

            3 -> { // Fes un programa que demani un número enter major que 1 a l'usuari i digui si el nombre és primer o no. Després, ens dirà quin és el nombre primer immediatament superior. Exemple:


            }

            4 -> { // Dos nombres enters i positius a i b són amics si la suma dels divisors enters del primer, a, excepte ell mateix és igual a la suma dels divisors del segon, b, excepte ell mateix. Exemple: Els números 33 i 16 són amics Fes un programa que demani dos enters positius i que determini si són amics.


            }

            5 -> { // Dissenya un programa que calculi el número de la sort d’una persona a partir de la seva data de naixement (dia, mes i any), la qual es proporcionarà com dada al programa com una única entrada en el format ddmmaaaa.


            }
*/
        }

    } while (exercici < 0)
    println("Gràcies per participar :)")
}
