import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que calcule el cuadrado de un número. 
		int num1;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		
		num1 = lector.nextInt();
		
		System.out.println("El cuadrado de su número es " +num1*num1);
		
		lector.close();
		
		
	}

}
