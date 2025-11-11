import java.util.Scanner;
public class Ej_9 {
    public static void main(String[] args) {

        /*
        9.	Hacer un programa que pida dos números. El programa ha de mirar cual de
        los dos es el mayor, y después mirar si este número mayor es divisible por el menor;
        en caso que lo sea ha de restar el mayor del menor,  en caso contrario los ha de sumar.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();

        if(num_1>num_2){

            System.out.println(num_1+ " es mayor que "+num_2);
            if(num_1%num_2==0){
                int resta=num_1-num_2;
                System.out.println("Restando mayor con menor es "+resta);

            }else {
                int suma = num_1 + num_2;
                System.out.println("La suma de los numeros es "+suma);

            }
        }else{

            System.out.println(num_2+ " es mayor que "+num_1);
            if(num_2%num_1==0){
                int resta=num_2-num_1;
                System.out.println("Restando mayor con menor es "+resta);

            }else {
                int suma = num_1 + num_2;
                System.out.println("La suma de los numeroooos es "+suma);

            }
        }
    }
}
