
import java.util.Scanner;
public class Ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		El dueño de una tienda compra un artículo a un precio determinado. Obtener el precio en que lo debe vender para obtener una ganancia del 30%.
	double compra; 
	double beneficio;
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduzca el valor de su compra");
	
	compra=lector.nextDouble();
	
	beneficio= compra+ (compra * 0.3);
	
//	System.out.printf("%.2f\n","Usted tiene que vender su artículo por " +beneficio+ "€ para obtener un benificio");
	// Esto de arriba estaría mal
	
	
	System.out.printf("%.2f",beneficio);
	System.out.println("€ sería la cantidad para tener un beneifcio del 30%");
	
	
lector.close();
	
	}

}
