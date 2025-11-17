import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Hacer un programa que determine si con el valor de los tres lados de un triángulo, se puede formar este triángulo. Para formar un triángulo, todos los lados deben cumplir que su tamaño sea más pequeño que la suma de los otros dos.
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca los tres lados de un triangulo ");
		
		int a=lector.nextInt();
		int b=lector.nextInt();
		int c=lector.nextInt();
		
		/*if((a+b)>c) {
//			System.out.println("Si se puede formar un triángulo");
		}
			else {
//				System.out.println("NO se puede formar un triángulo");
			}
				if((a+c)>b) {
//					System.out.println("Si se puede formar un triángulo");
				}
					else {
//						System.out.println("NO se puede formar un triángulo");
					}
						if((b+c)>a) {
							System.out.println("Si se puede formar un triángulo");
						}
							else {
								System.out.println("NO se puede formar un triángulo");*/
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("SI se puede formar un triángulo");
		}
			else {
				System.out.println("NO se puede formar un triángulo");
			}
							
				lector.close();
				
			
		}
	}

					
			
		
	
	


