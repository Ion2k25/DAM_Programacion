package EXAMEN_2;

import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Problema_1 {
    static void main(String[] args) throws IOException {
        /*
        Programa que muestre un menú al usuario en el que le permita elegir entre las siguientes opciones:

        a.  Ascensor. El programa solicita al usuario tres datos: si desea subir o bajar (s para subir b para bajar)
        planta actual y planta destino. El programa debe hacer control de entrada de forma que si el usuario quiere subir
        pero introduce una planta destino inferior a la actual, debe decirle que para subir la planta actual debe ser inferior que
        la de destino y volver a pedir datos. El programa una vez que tiene los tres datos coherentes mostrarña las plantas
        que recorre desde la actual a la de destino. Ejemplo:
               Entrada: s 5 1
               Salida: plantas incorrectas, para subir la planta destino debe ser mayor
               Entrada: s 5 10
               Salida: 6 7 8 9 10 Ha llegado a su destino.

        b.  Amigos. Opción que pida al usuario que introduzca dos números. El programa dirá si los números son amigos o no.
        Dos números son amigos cuando la suma de los divisores de uno es igual al otro y recíprcamente.
        Ejemplo: los números 220, 284 son amigos ya que los divisores propios de 220 son
        1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110, que suman 284 y los divisores propios de 284 son
        1, 2, 4, 71, 142 que suman 220.

        c.  La más larga. El programa pide al usuario que introduzca una frase. El progama indicará
        el número de caracteres de la palabra más larga introducida por el usuario y qué lugar ocupaba en la frase.
        Ejemplo: Hoy hace calor. La palabra más larga tiene 5 caracteres y ocupa el puesto 3.

        d.  Salir

         */

        Scanner sc = new Scanner(System.in);
        InputStreamReader lector = new InputStreamReader(System.in);

        System.out.println("+---------------+\n| MENU OPCIONES |\n+---------------+\n a.Ascensor\n b.Amigos\n c.Larga\n d.Salir");
        char opcion = (char) lector.read();
        opcion = Character.toUpperCase(opcion);


        switch (opcion) {
            case 'A':
                System.out.println("S -> Subir?\nB -> Bajar?");
                char p = sc.next().toUpperCase().charAt(0); //Esta es la unica manera para que no salga error, porque se mezcla el Scanner con el InputStreamReader


                switch (p) {
                    case 'S':
                        /*do {
                            System.out.println("\nPlanta actual?");
                            int actual = sc.nextInt();
                            System.out.println("Planta destino?");
                            int destino = sc.nextInt();


                            if (actual <= destino) {
                                for (int i = actual; i <= destino; i++) {
                                    System.out.println("Subiendo..." + i);
                                }
                            }
                        }*/
                        System.out.println("Destino es menor que actual. Vuelve a introducir");


                        break;
                    case 'B':

                        break;
                }
        }

    }
}
