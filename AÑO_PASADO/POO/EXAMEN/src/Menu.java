import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		String ruta= "";//Comilas obligatorias aqui
		StringBuilder ruta_2=new StringBuilder();//Aqui las comilllas las pone el builder
		
		int destino;
		int actual=3;
		int opcion;
		char opcion_2;
		do {
			System.out.println("MENU ASCENSOR\n");

			System.out.println("Escoja la opcion que desea\n");

			System.out.println("A-->destino planta");
			System.out.println("B-->Bajar planta");
			System.out.println("C-->Planta actual");
			System.out.println("D-->BBDD de la ruta");
			System.out.println("E-->Reset");
			System.out.println("F-->Salir\n");

			
			opcion_2 = (char) System.in.read();
	
			

//	opcion=lector.nextInt();

			switch (opcion_2) {
			case 'A':
			case 'a':
				do {
					System.out.println("Introduzca la planta a la que quiera destino y estamos en la planta "+actual);
					destino = lector.nextInt();
					
					
				} while(destino<actual);
				for(int i=actual;i<=destino;i++) {//EL IGAUL DEL destino HACE QUE META LA PLANTA FINAL TAMBIEN
					
					System.out.println("Voy por la planta "+i);
					
				}
				ruta=ruta+" de la "+actual+" a la " +destino+" \n";
				ruta_2.append(" de la "+actual+" a la builder " +destino+" \n");//Es mas eficiente, pero sale lo mismo
				actual=destino;
				System.out.println(ruta);
				System.out.println(ruta_2.toString());
	

//				if (destino > actual) {
//					System.out.println("Subiendo plantas " + destino);
//				} else {
//					System.out.println("Vuelva a introducir una planta");
//				}  TODO ESTO NO HACE FALTAAA PORQUE HAS HECHO LO ANTERIOR
				
				break;
				

			case 2:
				break;

			case 'D':
			case 'd':
				System.out.println(ruta);

				break;
			case 4:

				break;
			case 'F'://Es en el caso de si pulsa F=SALIR
			case 'f':
				break;

			default: //Es para que loe indique un mensaje en caso de letra equivodadda
				System.out.println("otr aadfdsf");
				break;

			}
		} while (opcion_2 != 'F');

	}
}
