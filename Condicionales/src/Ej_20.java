import java.util.Scanner;
public class Ej_20 {
    static void main(String[] args) {

        /*
        20.	Un comercio en rebajas realiza los descuentos dependiendo del importe
        de la compra siguiendo las siguientes reglas:
        -	Si es inferior a 10€ no se hace.
        -	Entre 10€ y 30€ se hará un 10%.
        -	Otros 20%
        Calcular el precio a cobrar a los clientes.

         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el precio de su compra");
        int compra=sc.nextInt();

        if(compra<10){
            System.out.println("Le falta al menos "+(10-compra)+ " € para que pueda disfrutar de un descuento");
        }else if(compra>=10 && compra<=30){
            double descuento=compra-(compra*0.3);
            System.out.println("Disfrutara de un 30%, se le queda en "+descuento+ " €");
        }else{
            double descuento=compra-compra*0.2;
            System.out.println("Disfrutara de un 20%, se le queda en "+descuento+ " €");
        }




    }
}
