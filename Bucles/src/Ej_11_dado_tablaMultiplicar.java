import java.util.Scanner;
public class Ej_11_dado_tablaMultiplicar {
    static void main(String[] args) {

        /*
        11.	Hacer un programa que muestre todos los resultados posibles que se pueden dar
        al lanzar dos dados.
         */

        Scanner sc=new Scanner(System.in);
        int dado_1=1;
        int dado_2=1;
        int contador=0;
        int suma=0;

        for(;dado_1<=6;dado_1++){

            for(dado_2=1;dado_2<=6;dado_2++){
                contador++;
                suma=dado_1*dado_2;
                System.out.print(dado_1+ " x "+dado_2+" = "+suma+"       ");


            }
            System.out.println();


        }
        System.out.println("\n\nSon un total de "+contador+" combinaciones diferentes");

    }
}
