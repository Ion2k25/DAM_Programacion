import java.util.Scanner;
public class Ej_1 {
    public static void main(String[] args) {
        /*
        1.	Hacer un programa que pida el precio y el descuento de un producto y
        calcule el total. Si el total supera los 100 euros, el programa ha de descontar 15€.
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el precio");
        int precio=sc.nextInt();
        System.out.println("Introduce el descuento");
        int descuento=sc.nextInt();

        int resultado =precio-((precio*descuento)/100);

        if(resultado>100)
            System.out.println("Enhorabuena, a su compra se le restara 15€ y se le queda en: "+(resultado-15)+" €");

        else
            System.out.println("Tiene que pagar "+resultado);

    }
}
