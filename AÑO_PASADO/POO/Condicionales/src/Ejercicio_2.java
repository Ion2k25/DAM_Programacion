import java.io.IOException;
import java.util.Scanner;
public class Ejercicio_2 {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//	Hacer un programa que pida el nombre, el precio y la cantidad de un producto. El programa ha de pedir el % de descuento, siempre y que el total sea mayor que 10.000 o el nombre del producto sea ‘A’. Calcular el total.
	
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del artículo, su precio y de seguido la cantidad del mismo");
		
		char nombre=(char)System.in.read();
		
		double precio=lector.nextDouble();
		
//		int cantidad=lector.nextInt();
		
		System.out.println("Introduzca el descuento a aplicar");
		
		double descuento=lector.nextDouble();
		
		double total=precio-(precio*descuento/100);
		
		
		if(total>1000){
			System.out.println("El total de su compra es "+total++);
			
		}
		else if(nombre=='A') {
			System.out.println("El total de su compra es " +total++);
		}
		else {
			System.out.println("Su compra tiene que llegar a 1000€ ");
		}
		lector.close();
		
			}
	
		
		
		
		
		
	}


