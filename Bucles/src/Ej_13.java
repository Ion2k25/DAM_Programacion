import java.util.Scanner;
public class Ej_13 {
    static void main(String[] args) {
        /*
        13.	Hacer un programa que dado un valor N, muestre la figura siguiente:

                    N=1		N=3		N=5
                    *			*		*
                                **		**
                                ***		***
                                        ****
                                        *****

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Tamaño piramide");
        int numero=sc.nextInt();



        for(int fila=1;fila<=numero;fila++){


            for(int columna=1;columna<=fila;columna++){
                System.out.print("*");
            }
            System.out.println(" ");
        }



        /*
        System.out.println("Introduce tamaño de piramide");
        int altura=sc.nextInt();

            for(int espacio=1;espacio<=altura;espacio++){
                System.out.println(" ");

                for(int simbolo=0;simbolo<=altura-espacio;simbolo++){
                    System.out.print("*");
                }
            }
            */
    }
}
