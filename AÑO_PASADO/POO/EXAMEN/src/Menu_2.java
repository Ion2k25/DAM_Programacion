import java.io.IOException;
import java.util.Scanner;

public class Menu_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		
		int destino;
		int actual=0;
		char opcion;
		
		do {
		System.out.println("----MENU ASCENSOR----\n");
		
		System.out.println("Escoja una opcion del menú\n");
		
		System.out.println("A-->Subir planta");
		System.out.println("B-->Bajar Planta");
		System.out.println("C-->Mostrar actual");
		System.out.println("D-->Ruta");
		System.out.println("E-->Resetear");
		System.out.println("F-->Salir");
		
		opcion = (char)System.in.read();
		
		
		switch(opcion) {
		
		case 'A':
		case 'a':
			break;
			
		}
		}while(opcion !='F');
		
	}

}
