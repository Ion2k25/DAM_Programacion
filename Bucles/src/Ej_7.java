import java.util.Scanner;
public class Ej_7 {
    static void main(String[] args) {
        /*
        7.	Hacer un programa que pida N números por teclado, los sume y en calcule la media.
         */


        Scanner sc=new Scanner(System.in);
        int num;
        int aux=0;
        int contador=0;
        System.out.println("Introduce numeros");
        do{
            num=sc.nextInt();
            aux+=num; //Hace que se guarden los valores, no se sobreescriban
            if(num!=0) { //Un if para que el 0 que introduces, no lo cuente el contador
                contador++;
            }
        }while(num!=0);{
            int suma=aux/contador;
            System.out.println(suma);

        }
    }
}
