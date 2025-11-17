import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Hacer un programa que pida el precio y el descuento de un producto y calcule el total. Si el total supera los 100 euros, el programa ha de descontar 15€.

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce el precio de su artículo");

		double precio = lector.nextDouble();

		System.out.println("Introduce el descuento a aplicar sobre 100 ");

		int descuento = lector.nextInt();

		double total = precio - ((precio * descuento) / 100);

		if (total > 100) {
			
			System.out.println("Enhorabuena, se le ha descontado 15€, el total de su compra sería " +(total-15));
		}
		else {
			System.out.println("Usted tendría que llegar a los 100€ para disfrutar de 15€ de descuento ");
		}
		
		System.out.println("Muchas gracias por su compra!!");
		
		lector.close();
		
	}

}
