import java.util.Scanner;
public class Ej_22 {
    static void main(String[] args) {

        /*
        22.	En un supermercado se hace una promoción, mediante la cual el cliente
        obtiene un descuento dependiendo de un numero que se escoge al azar. Si el numero
        escogido es menor que 74 el descuento es del 15% sobre el total de la compra, si es
        mayor o igual a 74 el descuento es del 20%. Obtener cuanto dinero se le descuenta.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce cantidad de compra");
        int compra=sc.nextInt();
        System.out.println("Introduce un numero");
        int num=sc.nextInt();


        if(num<74){
            double desc=compra-(compra*0.15);
            System.out.println("Se le queda en "+desc);
        }else {
            double desc = compra - (compra * 0.2);
            System.out.println("Se le queda en "+desc + " €");

        }
    }
}
