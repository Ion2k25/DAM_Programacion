import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {

        /*
        8.	Dados dos números, dar la relación entre ellos. Señalar el mayor, el
        menor o especificar si son iguales
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();

        if(num_1>num_2){
            System.out.println(num_1+ " es mayor que "+num_2);
        }
        if(num_2>num_1) {
            System.out.println(num_2 + " es mayoor que " + num_1);
        }
        if(num_1==num_2){
                System.out.println(num_1+" y "+num_2 +" son iguales");
        }

    }
}
