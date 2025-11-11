import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {

        /*
        11.	Hacer un programa que pida tres números por el teclado, y los imprima en orden ascendente.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce tres numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int num_3=sc.nextInt();

        if(num_1>num_2 && num_1>num_3){
            if(num_2>num_3){
                System.out.println(num_1 + " "+num_2+ " "+num_3);
            }else
                System.out.println(num_1 + " "+num_3+ " "+num_2);

        }else if(num_2>num_1 && num_2>num_3){
            if(num_1>num_3){
                System.out.println(num_2+ " "+num_1+" "+num_3);
            }else
                System.out.println(num_2+ " "+num_3+ " "+num_1);

        }else if(num_3>num_1 && num_3>num_2){
            if(num_1>num_2){
                System.out.println(num_3+ " "+num_1+ " "+num_2);
            }else
                System.out.println(num_3+ " "+num_2+ " "+num_1);
        }
    }
}
