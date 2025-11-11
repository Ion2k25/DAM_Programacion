import java.util.Scanner;
import java.util.Random;
public class Ejercicios {
    public static void main(String[] args) {

        int vector[]=new int[15];
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
        for (int i = 0; i<vector.length;i++){
            vector[i]=random.nextInt(200,3700);

        }

        int N;
        do{
            System.out.println("INTRODUCE CUANTOS NUMEROS QUIERES SUMAR");
            N=sc.nextInt();

        }while(N>vector.length);

    }
}
