import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que pida tres números A, B, C, y después haga el cálculo siguiente: D=((A+B) / C).
		int num1, num2, num3;
		
		System.out.println("Introduce tres números ");
		
		Scanner lector = new Scanner(System.in);
		
		num1 = lector.nextInt();
		num2 = lector.nextInt();
		num3 = lector.nextInt();
		
		System.out.println("La suma de sus números es " +(num1+num2)/num3);
		
		lector.close();
		
		
	}

}
