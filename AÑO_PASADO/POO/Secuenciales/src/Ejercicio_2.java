import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Hacer un programa que pida el precio y la cantidad de un producto y calcule el total. Utilizar variables enteras.

		int  precio, cantidad;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el precio de su articulo");
		
		precio = lector.nextInt();
		
		lector.nextLine();
		
		System.out.println("Introduzca la cantidad de articulos");
		
		cantidad = lector.nextInt();
		
		System.out.println("La cantidad total que debe de pagar es "+(precio*cantidad));
		 
		System.out.println("Muchas gracias por confiar en nosotros");
		 
		lector.close();
		
	}

}
