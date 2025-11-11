import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ej_2_Chars {
    public static void main(String[] args) throws IOException {

    /*
       2.	Hacer un programa que pida el nombre, el precio y la cantidad de un producto.
       El programa ha de pedir el % de descuento, siempre y que el total sea mayor que 10.000 o el
       nombre del producto sea ‘A’. Calcular el total.
     */
        char letra;
        Scanner sc=new Scanner(System.in);
        InputStreamReader lector= new InputStreamReader(System.in);
        System.out.println("Introduce el nombre de tu articulo");
        letra = (char)lector.read();
        System.out.println("Introduce el precio");
        int precio=sc.nextInt();
        System.out.println("Introduce la cantidad del prodcuto");
        int cantidad=sc.nextInt();


        if(precio>1000 && letra=='a'){
                System.out.println("Introduce el % de descuento");
                int descuento=sc.nextInt();
                int total=(precio-((precio*descuento)/100))*cantidad;
                System.out.println("Total de su compra es "+total);

        }
        else {
            int total = precio * cantidad;
            System.out.println("Total de su compra sería "+total+ " €");

        }





    }
}
