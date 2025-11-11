import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej_17 {
    public static void main(String[] args)throws IOException {
        /*
        17.	Hacer un programa que pida dos números A, B y un signo S. Hacer la
        operación correspondiente con los números A y B dependiendo de si
        S = ‘+’, ‘-’, ‘:’ o ‘x’. Si S no es ninguno de estos valores, el programa
        ha de mostrar un mensaje avisando que no puede operar los valores.
         */

        InputStreamReader lector=new InputStreamReader(System.in);
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        System.out.println("Introduce uno de los siguientes signos: \n+\n-\n:\nx");
        char signo=(char)lector.read();
        signo=Character.toLowerCase(signo);

        switch(signo){
            case '+':
                System.out.println("Total= "+(num_1+num_2));
                break;
            case '-':
                System.out.println("Total= "+(num_1-num_2));
                break;
            case ':':
                System.out.println("Total= "+num_1/num_2);
                break;
            case 'x':
                System.out.println("Total= "+num_1*num_2);
                break;

        }

    }
}
