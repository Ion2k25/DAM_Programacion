import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que pida dos números enteros por el teclado y los sume.
		int numero1,numero2;
		
		System.out.println("Introduzca dos números");
		
		Scanner lector = new Scanner(System.in);
		
		numero1= lector.nextInt();
		numero2= lector.nextInt();
	
		
		System.out.println("La suma de sus dos números es " +(numero1+numero2));
		
		lector.close();
	}

}
