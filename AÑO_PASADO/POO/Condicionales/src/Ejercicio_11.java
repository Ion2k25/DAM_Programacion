import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hacer un programa que pida tres números por el teclado, y los imprima en orden ascendente.
	
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Introduce tres numeros");
	
	int num_1=lector.nextInt();
	int num_2=lector.nextInt(); 
	int num_3=lector.nextInt();
	

	if (num_1<num_2 && num_1<num_3) 
	{
		System.out.println(num_1);
		else {
			if(num_1>num_2) {
				System.out.println("si");
				
			}
		}
	}
	
	
lector.close();

	
	}
}
	
	