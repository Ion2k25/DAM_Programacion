import java.util.Scanner;
public class Ej_5 {
    static void main(String[] args) {
        /*
        5.	Hacer un programa que pida tres números N, M y Y. Mostrar todos los valores
        comprendidos entre N y M con un intervalo Y. Si M < N, antes se habrán de intercambiar
        los valores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 numeros");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int y = sc.nextInt();
        int aux=0;

        if(m<n){
            aux=m;
            m=n;
            n=aux;
            for(int i=n;i<=m;i+=y){
                System.out.println(i);

            }

        }





    }
}
