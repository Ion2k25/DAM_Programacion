import java.util.Scanner;
public class Ej_15 {
    static void main(String[] args) {
        /*
        15.	Hacer un programa que pida dos números por teclado. Ha de calcular el producto
        de los dos números, pero utilizando sumas. Por ejemplo 3x4 = 3+3+3+3.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int contador=0;
        int total=0;

        for(int i=1;i<num_2;i++){
            contador++;
            System.out.print(num_1+" + ");
        }
        total=num_1*num_2;
        System.out.print(num_1+ " = "+total);
    }
}
