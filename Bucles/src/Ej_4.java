import java.util.Scanner;

public class Ej_4 {
    static void main(String[] args) {
        /*
        4.	Repetir el programa For4, pero en el caso que M < N, intercambie los valores y
        muestre los números comprendidos entre ellos.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int aux=0;

        if(n>m){
            aux=n;
            n=m;
            m=aux;
            for (; n <= m; n++) {
                System.out.println(n);
            }
        }else
            System.out.println("Adios");
            }

        }




