import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Hacer un programa que pida dos números  y que después los imprima en orden ascendente.
	
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce dos números");
	
	int num1=lector.nextInt();
	int num2=lector.nextInt();
	
	if (num1<num2) 
		System.out.println(+num1+"\n"+num2++);
	
		else
			System.out.println(+num2+"\n"+num1++);
	
		lector.close();
		
		}
	
	}


