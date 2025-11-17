import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Maru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Digame su nombre");
		
		String nombre= lector.next();
		
		System.out.println("De acuerdo, su nombre es " +nombre+ ". Muchas gracias");
		
		
	}

}
