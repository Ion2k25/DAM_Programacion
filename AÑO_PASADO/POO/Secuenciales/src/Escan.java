import java.util.Scanner;

public class Escan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		System.out.println("De acuerdo, su numero es " +num++);
		
		
		sc.nextLine();
//		Se añade esto para que no salte directamente hasta el final y asi no puedas escribir la frase.
		
		
		System.out.println("Introduce una frase ");
		
		String letra = sc.nextLine();
		
		System.out.println("Esta es su frase " +letra);
		
		
		
		
	}

}
