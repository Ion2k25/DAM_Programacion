
import java.util.Scanner;
public class Ej_7 {
    public static void main(String[] args) {

        /*
        7.	Hacer un programa que pida dos números  y que después los imprima en orden ascendente.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();

        if(num_1>num_2){
            System.out.println(num_1+ " "+ num_2);
        }else
            System.out.println(num_2+ " "+num_1);

    }
}
