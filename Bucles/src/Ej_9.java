import java.util.Scanner;
public class Ej_9 {
    static void main(String[] args) {
        /*
        9.	Hacer un programa que pida un número y calcule su factorial. Por ejemplo, factorial
        de 3 es 3x2x1 = 6, factorial de 4 es 4x3x2x1 = 24.
         */

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
