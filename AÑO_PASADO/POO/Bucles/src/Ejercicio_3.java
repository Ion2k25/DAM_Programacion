import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hacer un programa que pida dos números por el teclado N y M, y si M > N muestre todos los valores comprendidos entre estos dos números.
		
		Scanner lector = new Scanner(System.in);
		
		
		
		int n;
		int m;
		
		System.out.println("Introduce 1 numeros");
		
		n=lector.nextInt();
		
		System.out.println("Introduce 2 numeros");
		
		m=lector.nextInt();
		
		
			//DO-WHILE Y FOR IGUALES
		
			
		
			//Aqui si pones el n++ antes del syso, te va a imprimir el siguiente numero, 
			//si lo pones despues, te imprime el mismo y luego el siguiente

//		if(m>n) {
//		
//			do {
//				
//				System.out.println(n);
//				n++;
//				
//			}while(m>n);
//			
//		}else
//			System.out.println(n+" es mayor que "+m);
		
		
		
		
		
			//En el caso del for, NO OLVIDES los corchetes, para que el syso lo reconozca y con el n++ 
			//lo puedes poner al principio para que directamnete empiece a sumar
			
			if(m>n) {
				
			
			for(n++;m>n;n++) {
			System.out.println(n);
			 //Si pones esta sentencia fuera de los {}, se va a ejecutar una vez
			
			}
			System.out.println("Adios");
			}
			else
				System.out.println(n+" es mayor que "+m);
			
			
		
			
			
			
			
			

		
	
		
		
		
		
			
		
		
		
	}

}
