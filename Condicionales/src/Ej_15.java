
import java.util.Scanner;
public class Ej_15 {
    public static void main(String[] args) {

        /*
        15.	Hacer un programa que pida el valor de un año y diga si es bisiesto o
        no lo es. Un año es bisiesto, cuando es divisible por 4, siempre y cuando no
        lo sea también por 100, pero en este caso si es divisible por 400, también es
        bisiesto. (Resumiendo, ha de ser divisible por 4, y si lo es por 100, también
        lo ha de ser por 400 )
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un año para saber si es bisiesto");

        int ano=sc.nextInt();

            //Utilizar != es igual a no divisible
        if((ano%4==0 && ano%100!=0) || (ano%400==0)){
            System.out.println("Es bisiesto");
        }else
            System.out.println("No es bisiesto");

        }
    }

