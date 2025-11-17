import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Probar los métodos de tipo de número
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("El número es: "+ Tipo_Numero.tipoDeNumero(numero));

        //Probar el método imprimir imagen
        System.out.print("Introduce el número de filas para la pirámide: ");
        int filas = sc.nextInt();
        Imprimir_Piramide.imprimirPiramide(filas);
    }
}
