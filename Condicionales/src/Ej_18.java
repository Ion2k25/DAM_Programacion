import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej_18 {
    public static void main(String[] args) throws IOException {
        /*
        18.	Hacer un programa que pida dos números A, B, y un carácter L. Si el valor
        del carácter L es ‘A’, calcular el perímetro de un rectángulo con los valores
        de A y B correspondientes a los lados; si el valor de L es ‘B’, calcular el
        área del rectángulo; si el valor de L es ‘C’, calcular el área de un
        triángulo de altura A y base B; si el valor de L es ‘D’ calcular el valor
        de la hipotenusa de un triángulo que tiene A y B como catetos.
         */

        InputStreamReader lector=new InputStreamReader(System.in);
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        float num_1=sc.nextFloat();
        float num_2=sc.nextFloat();
        System.out.println("Introduce uno de los siguientes signos:\n-A\n-B\n-C\n-D");
        char signo=(char)lector.read();
        signo=Character.toUpperCase(signo);

        switch(signo){
            case 'A':
                System.out.println("Perímetro del triángulo es: "+Math.);
        }





    }
}


