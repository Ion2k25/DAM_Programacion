import java.io.IOException;
import java.io.InputStreamReader;
public class Ej_12_Char {
    public static void main(String[] args) throws IOException {
        /*
        12.	Hacer un programa que pida un carácter y diga si es una letra mayúscula.
        Dentro del código ASCII los caracteres mayúscula están comprendidos entre el 65(A), y
        el 90(Z).
         */

        /*
        char letra = 'A';
        int numero = (int) letra; // convierte el char a int
        System.out.println(numero);

        int codigo = 97;
        char letra_2 = (char) codigo; // convierte el número a char
        System.out.println(letra_2);

         */

        InputStreamReader lector = new InputStreamReader(System.in);
        System.out.println("Introduce una letra");
        char letra= (char)lector.read();

        //Es lo mismo poner >=65 que >='A'
        if(letra >= 65 && letra<= 90){
            System.out.println("La letra "+letra+" es mayúscula");
        }else
            System.out.println("La letra "+letra+" es minuscula");

    }
}
