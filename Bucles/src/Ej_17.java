import java.util.Scanner;
public class Ej_17 {
    static void main(String[] args) {
        /*
        17.	Hacer un programa que muestre los N primeros términos de la serie.
            1, 2, 4, 8, 16, 32, 64, 128, .....
            N es un valor que se ha de entrar desde el teclado.

         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n=sc.nextInt();
        int contador=0;
        int aux=1;


        for(int i=1;contador<n;i++){
            contador++;
            System.out.println(aux);
            aux=aux*2;

        }


    }
}
