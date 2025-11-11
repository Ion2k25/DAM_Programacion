import java.util.Scanner;
public class Ej_6 {
    public static void main(String[] args) {

        /*
        6.	Hacer un programa que pida dos números por el teclado, si el primer número es
        divisible por el segundo, los ha de sumar, sino, los ha de multiplicar.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num_1=sc.nextInt();
        System.out.println("Introduce otro numero");
        int num_2=sc.nextInt();

        if(num_1%num_2==0) {
            int suma=num_1+num_2;
            System.out.println("Su numero es "+suma);
        }else {
            int multi=num_1*num_2;
            System.out.println("Su numero es "+multi);
        }

        }

}
