import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {

        /*
        10.	Hacer un programa que pida tres números, y después diga cual de los tres es el mayor.
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce tres numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int num_3=sc.nextInt();

        if(num_1>num_2 && num_1>num_3){
            System.out.println("El mayor es "+num_1);
        }else if(num_2>num_1 && num_2>num_3){
            System.out.println("El mayoor es "+num_2);
        }else
            System.out.println("El mayooooor es "+num_3);
    }
}
