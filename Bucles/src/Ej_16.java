
import java.util.Scanner;
public class Ej_16 {
    static void main(String[] args) {
        /*
        16.	Hacer un programa que pida la base y el exponente. Se ha de  calcular la
        potencia. El programa ha de controlar , que si exponente = 0, potencia = 1, y si
        exponente = 1, potencia = base.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la base");
        int base=sc.nextInt();
        System.out.println("Introduce el exponente");
        int expo=sc.nextInt();

        int pot=1;
        int contador=0;

        if(expo==0){
            System.out.println("Potencia es = 1");
        }else if(expo==1){
            System.out.println("Potencia es = "+base);
        }else{
            for(;contador<expo;contador++){
                pot=pot*base;
            }
            System.out.println("Potencia es = "+pot);
        }
    }
}
