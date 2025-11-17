import java.util.Scanner;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hacer un programa que pida tres números, y después diga cual de los tres es el mayor.
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tres números");
		
		int num_1=lector.nextInt();
		int num_2=lector.nextInt();
		int num_3=lector.nextInt();
		
		if(num_1>num_2) {
			if(num_1>num_3) {
			System.out.println("El mayor numero es " +num_1);
			}
			else {
				System.out.println("El mayor numero es "+num_3);
				
			}
		
		}
		else {
			if(num_2>num_3) {
				System.out.println("El mayor numero es "+num_2);
			}
			else {
				System.out.println("El mayor numero es " +num_3);
			}
		}
		
		lector.close();
		
		}
	}

