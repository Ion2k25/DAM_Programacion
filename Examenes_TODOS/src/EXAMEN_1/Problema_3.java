package EXAMEN_1;

import java.util.Scanner;
public class Problema_3 {
    static void main(String[] args) {

        /*
        Programa que pide N al usuario y el número que conformarán las siguientes pirámides:

        N=3 número 2          N=3 número=3      N=4 número=2        N=4 número=3
        1                       1               1                   1
        1 2                     1 3             1 2                 1 3
        1 2 4                   1 3 9           1 2 4               1 3 9
                                                1 2 4 8             1 3 9 27

        Hacer el espejo de las pirámides sin repetir la última fila
         */

        Scanner sc=new Scanner(System.in);


        System.out.println("Introduce tamaño de piramide");
        int i=sc.nextInt();

        for(int e=1;e<=i;e++){

            for(int j=1;j<e;j++){
                System.out.print("*");
            }
        }System.out.println();

    }
}
