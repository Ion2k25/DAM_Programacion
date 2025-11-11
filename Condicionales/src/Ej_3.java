import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {

     /*
     3.	Introducir dos números por el teclado, dividendo y divisor. Si dividendo es
     divisible por divisor, el programa ha de mostrar el mensaje “DIVISIBLES”.
      */

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el dividendo");
        int dividendo=sc.nextInt();
        System.out.println("Introduce el divisor");
        int divisor=sc.nextInt();


            if (dividendo % divisor == 0)
                System.out.println("DIVISIBLES");
            else
                System.out.println("No DIVISIBLES");


    }
}
