import java.util.Scanner;
import java.util.Random;
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que pida los valores de los dos catetos de un triángulo rectángulo, y calcule el valor de la hipotenusa. Utilizar la librería Math.
//		h(al cuadrado)= c1(al cuadrado)+c2(al cuadrado)	
		double cateto1, cateto2, hipotenusa;
		
		
		/*cateto2=0;
		cateto1=10;
		hipotenusa=0;*/
		
		System.out.println("Dime los valores de los dos catetos del triángulo rectángulo");
		
		Scanner lector = new Scanner(System.in);
		
		cateto1 = lector.nextDouble();
		cateto2 = lector.nextDouble();
		
		hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));

		
		System.out.println("Su hipotenusa es igual a "+hipotenusa++);
		
		lector.close();
		
		
		
		
		
		
		
	}

}
