import java.util.Scanner;
public class Ej_19 {
    static void main(String[] args) {

        /*
        19.	Programa que desglose cierta cantidad de segundos (enteros) introducida
        por teclado en su equivalente en semanas, días, horas, minutos y segundos.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce segundos");
        float sec=sc.nextInt();
/*
        if(sec>=604800){
            float suma=sec/604800;
            System.out.println("Semana"+suma);
        }
        if(sec>=86400){
            System.out.println("Dias");
        }
        if(sec>=3600){
            System.out.println("Horas");
        }
        if(sec>=60){
            System.out.println("Minutos");
        }
        if(sec==sec){
            System.out.println("Segundos");
        }*/


        System.out.printf("Semana= %.0f%n",(sec/604800));

        System.out.printf("Dias= %.0f%n",(sec/86400));

        System.out.printf("Horas= %.0f%n",(sec/3600));

        System.out.printf("Minutos= %.0f%n",(sec/60));

        System.out.printf("Segundos= %.0f%n", (sec*1));









    }
}
