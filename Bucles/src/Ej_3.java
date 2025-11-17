
import java.util.Scanner;
public class Ej_3 {
    static void main(String[] args) {
        /*
        3.	Hacer un programa que pida dos números por el teclado N y M, y si M > N muestre
        todos los valores comprendidos entre estos dos números.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int n=sc.nextInt();
        int m=sc.nextInt();

        if (n > m) {
            for (; m <= n; m++) {
                System.out.println(m);
            }
        }else{
            System.out.println("Nada");
        }

    }
}
