
import java.util.Scanner;
public class Ej_14 {
    static void main(String[] args) {
        /*
        14.	Hacer un programa que dado un valor N, muestre la figura siguiente:

                        N=1		N=3		N=5
                        *			*		*
                        *			**		**
                                    ***		***
                                    ***		****
                                    **		*****
                                    *		*****
                                            ****
                                            ***
                                            **
                                            *

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño de la pirámide");
        int n=sc.nextInt();

        for(int fila=1;fila<=n;fila++){

            for(int columna=1;columna<=fila;columna++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int fila=1;fila<=n;fila++){

            for(int columna=n;columna>fila;columna--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
