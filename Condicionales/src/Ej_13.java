
import java.io.IOException;
import java.io.InputStreamReader;
public class Ej_13 {
    public static void main(String[] args) throws IOException {
        /*
        13.	Hacer un programa que pida un carácter, diga si es una letra mayúscula
        (ASCII del 65 al 90), una letra minúscula (ASCII del 97 al 122),o bien otro carácter.
         */


            InputStreamReader lector = new InputStreamReader(System.in);
            char letra = (char) lector.read();

            if (letra >= 65 && letra <= 90) {
                System.out.println("Es MAYUSCULA");
            } else if (letra >= 97 && letra <= 122) {
                System.out.println("Es minuscula");
            } else
                System.out.println("Es otro caracter");
    }
}
