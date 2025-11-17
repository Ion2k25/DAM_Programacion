package EXAMEN_1;

import java.util.Scanner;
public class Problema_2 {
    static void main(String[] args) {

        /*
        No se si será vuestro caso, pero hay quienes odian a los números y quizás están en los cierto,
        los números o son odiosos o son malvados.

        Hacer un programa que pida al usuario números y cuando no desee introducir más introduzca un número negativo.
        El programa deberá ir pidiendo número y decirle al usuario si es odioso o malvado, el número introducido.

        Un número entero positivo que tiene un número de unos impar en su expansión binaria es odioso y
        y si tiene un número de unos par es malvado.

        Ejemplo de número odiosos: 1, 2, 4, 7, 8...
        1->1    2->01   4->100    7->111     8->1000

        Ejemplo de números malvados: 0, 3, 5, 6, 9...
        0->0    3->11   5->101    9->1001

         */

        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Introduce varios numeros \nIntroduce numero NEGATIVO para finalizar programa");
        do {

            i = sc.nextInt();
        }while(i>=0);

        if(i%2==0){

            System.out.println(i/2);

        }else{
            System.out.println();
        }



    }
}
