import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Hacer un programa que pida dos números por el teclado, si el primer número es divisible por el segundo, los ha de sumar, sino, los ha de multiplicar.
	
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce dos numeros");
	
	int num1=lector.nextInt();
	int num2=lector.nextInt();
	
	if(num1 % num2==0) {
		System.out.println("La suma de sus numeros es "+(num1+num2));
	}
	else {
		System.out.println("El producto de sus nueros es "+(num1*num2));
	}
	lector.close();
	
	}

}
