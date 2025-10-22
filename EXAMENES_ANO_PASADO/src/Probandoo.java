import java.util.Scanner;

public class Probandoo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la pirámide");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
            for(num=1;num<=i;num++){
                System.out.print("* ");
            }
        }
    }
}
