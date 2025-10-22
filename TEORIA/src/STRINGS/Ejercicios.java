package STRINGS;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                        /*
    //1. Concatena dos cadenas de texto

        System.out.println("Introduce tu nombre y apellidos ");
       var nombre = sc.nextLine();
       System.out.println("Introduce nombre y apellidos de tu compañero");
       var compañero =sc.nextLine();

        System.out.println(nombre + compañero);
                        */


                        /*
    //2. Muestra la longitud de una cadena de texto

        System.out.println("Introduce un texto");
        var texto= sc.nextLine();
        System.out.println("La longitud del texto es: "+texto.length()); //LOS ESPACIOS TAMBIEN LOS CUENTA

                            */


                        /*
    //3. Muestra el primer y último carácter de un string

        System.out.println("Introduce tu nombre");
        var nombre =sc.nextLine();
        System.out.println("La primera letra de tu nombre es: "+nombre.charAt(0)+"\nY la última letras es: "+nombre.charAt(nombre.length()-1));
                        */


                        /*
    //4. Convierte a mayúsculas y minúsculas un string
        System.out.println("Introduce un refrán");
        var refran = sc.nextLine();
        System.out.println("-------MAYÚSCULAS---------");
        System.out.println(refran.toUpperCase());
        System.out.println("-------minúsculas---------");
        System.out.println(refran.toLowerCase());
                           */


                        /*
    //5. Comprueba si una cadena de texto contiene una palabra concreta

        System.out.println("Dime una frase mítica");
        var pais = sc.nextLine();
        System.out.println(pais.contains("Sevilla"));
                        */


    //6. Formatea un string con un entero
        System.out.println("Introduce un nombre");
        var nombre =sc.nextLine();
        System.out.println(String.format("%d",nombre));
    //7. Elimina los espacios en blanco al principio y final de un string
    //8. Sustituye todos los espacios en blanco de un strinf por un guion (-)
    //9. Comprueba si dos strings son iguales
    //10. Comprueba si dos strings tienen la misma longitud

    }
}
