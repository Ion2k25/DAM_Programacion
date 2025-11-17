import java.util.Scanner;
public class Ej_10 {
    static void main(String[] args) {
        /*
        10.	Hacer un programa que pida N números. El programa ha de decir cuantos hay de
        pares, y cuantos de impares.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce 5 numeros");
        int num;
        int pares=0;
        int impares=0;
        int contador=0;
        do{
            num=sc.nextInt();
            if(num%2==0){
                pares++;

            }else{
                impares++;

            }
            contador++;
        }while(contador<5);

        System.out.println("Hay tantos numeros pares "+pares);
        System.out.println("Hay tantos numeros impares "+impares);



        }
    }

