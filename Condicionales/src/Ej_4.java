import java.util.Scanner;
public class Ej_4 {
    public static void main(String[] args) {

        /*
        4.	Hacer un programa que determine si con el valor de los tres lados de un triángulo,
        se puede formar este triángulo. Para formar un triángulo, todos los lados deben cumplir
        que su tamaño sea más pequeño que la suma de los otros dos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los tres valores de un triangulo");
        int lado_1 = sc.nextInt();
        int lado_2 = sc.nextInt();
        int lado_3 = sc.nextInt();

        int suma = lado_1 + lado_2 + lado_3;

        if (lado_1+lado_2> lado_3 && lado_1+lado_3>lado_2 && lado_2+lado_3>lado_1 ) {
            System.out.println("FORMAN TRINAGULO");
        }
        else
            System.out.println("No se puede formar triangulo");
    }
}
