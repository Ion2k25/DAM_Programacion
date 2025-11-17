import java.util.Scanner;
public class Ej_18 {
    static void main(String[] args) {

        /*
        18.	Hacer un programa que calcule los N primeros términos de la serie de
        Fibonacci. En esta serie cada valor se obtiene de la suma de los dos anteriores.
			1, 1, 2, 3, 5, 8, 13, 21, 34, ....
	        N es un valor que se ha de introducir desde teclado.

         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n=sc.nextInt();
        int contador=0;
        int aux=1;
        int aux_2=1;
        int nuevo;
        for(int i=0;contador<n;i++){
            contador++;
            aux=aux+i;
            nuevo=aux+aux_2;
            System.out.println(aux_2);

        }

    }
}
