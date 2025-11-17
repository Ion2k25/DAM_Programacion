/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;
import java.util.Scanner;
/**
 *
 * @author gema
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //ENTRADA DE DATOS NUMÉRICOS SCANNER (librería java.util.Scanner)
        int numero1,numero2;
        Scanner lector= new Scanner(System.in);
        System.out.print("Introduzca dos numeros: ");
        numero1 = lector.nextInt();
        numero2 = lector.nextInt();
        //igual con nextFloat();
        System.out.println("La suma de " + numero1 +" y "+numero2+ " es "+ (numero1+numero2));
        //prueba la salida dejando espacio entre los números o intro y verás cómo funciona


    }
}
