import java.util.Scanner;

public class CORREOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector= new Scanner(System.in);
		
		int opcion=0;
		
		do {
			
		
		System.out.println("Bienvenido a Correos\nEscoja una opcion\n");
		
		System.out.println("1-->Cliente");
		System.out.println("2-->Trabajador");
		System.out.println("3-->Salir");
		
		opcion=lector.nextInt();
		
		
		
		switch(opcion) {
		case 1:
			int opcion_2;
			do {
				System.out.println("Escoja una opcion\n");
				
				System.out.println("1-->Enviar");
				System.out.println("2-->Recoger");
				System.out.println("3-->Salir");
				opcion_2=lector.nextInt();
				
				switch(opcion_2) {
				case 1:
				
//					i++;
//					System.out.println("ENV00"+i);
//					i++;
					for(int i=0;i>0;i++) {
						System.out.println(i);
					
					}
					break;
				case 2:
					System.out.println("Esta en recoger");
					break;
					
				}
				
			}while(opcion_2<3);
				break;
				
		case 2:
			break;
			
		}
		}while(opcion<3);
		
		System.out.println("Hasta pronto!!");
		
		
		
		
		
	

		}}
