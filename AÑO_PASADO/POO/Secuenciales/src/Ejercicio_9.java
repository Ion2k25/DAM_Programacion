import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//	Introducir  un carácter por el teclado, y mostrar su código ASCII.	
		
		
		/*char caracter;
		
		System.out.println("Introduzca un carácter del teclado");
		
		caracter=(char) System.in.read();
		
		System.out.println(caracter+ " su valor escii es: "+ (int)caracter);*/
		
		
		int asciicaracter;
		
		System.out.println("Introduzca un carácter del teclado");
		
		Scanner lector = new Scanner(System.in);
		
		asciicaracter= lector.nextInt();
		
		
		System.out.println((char)asciicaracter+ " su valor escii es: "+ asciicaracter++);
		
	
		
		
	}

}
