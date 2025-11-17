import java.util.Scanner;
public class Ej_6 {
    static void main(String[] args) {
        /*
        6.	Hacer un programa que pida un número, y después muestre su tabla de multiplicar.

         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero");
        int i=sc.nextInt();

        for(int j=1;j<=10;j++){
            int mult=i*j;
            System.out.print(mult+" ");


        }
    }
}
