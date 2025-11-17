
import java.util.Scanner;
public class Ej_12 {
    static void main(String[] args) {

        /*
        12.	Hacer un programa que muestre las primeras 10 tablas de multiplicar.
         */


        Scanner sc=new Scanner(System.in);
        int resultado=0;
        for(int i=1;i<=10;i++){

            for(int j=1;j<=10;j++){
                resultado=i*j;
                System.out.printf(j+ " * "+i+ " = "+resultado+ "                  ");
            }
            System.out.println();
        }


    }
}
