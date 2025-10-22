import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduce el numero que usted desee");

            n = sc.nextInt();

            if (n == 0) {
                System.out.println("El numero que usted desee es mayor a 0");
            } else if (n < 10) {
                System.out.println("El numero que usted desee es mayor a 10");

            } else if (n == 100) {
                System.out.println("El numero que usted desee es mayor a 100");

            } else
                System.out.println("El numero que usted desee es mayor a 100");

        }while (n >1);
    }


}

