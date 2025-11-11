import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ej_16 {
    public static void main(String[] args) throws IOException {

        /*
        16.	Un tendero tiene cinco tipos de zanahoria, el tipo A = 1.5 €/Kg.,
        el tipo B = 1.8 €/Kg. El tipo C = 2.1 €/Kg. , el tipo D = 2.5 €/Kg. y el
        tipo F = 3.2 €/Kg. Hacer un programa que pida el tipo de zanahoria y la
        cantidad y luego calcule el total.
         */

        Scanner sc = new Scanner(System.in);
        InputStreamReader lector = new InputStreamReader(System.in);

        System.out.println("Introduce la cantidad de zanahoria");
        double kg = sc.nextDouble();
        System.out.println("Introduce el tipo de zanahoria");
        char tipo = (char) lector.read();
        tipo= Character.toUpperCase(tipo);

       switch(tipo){
           case 'A':
               System.out.println("1-Usted tiene que pagar "+kg*1.5);
               break;
           case 'B':
               System.out.println("2-Usted tiene que pagar "+kg*1.8);
               break;
           case 'C':
               System.out.println("3-Usted tiene que pagar "+kg*2.1);
               break;
           case 'D':
               System.out.println("4-Usted tiene que pagar "+kg*2.5);
               break;
           case 'E':
               //%.2f es igual a imprimir solo dos decimales
               //%.2f%n es igual a imprimir solos dos decimales y luego salto de linea
               // que lo hacer el %n
               System.out.printf("5-Usted tiene que pagar %.3f%n",kg*3.2);
               break;

        }
    }
}
