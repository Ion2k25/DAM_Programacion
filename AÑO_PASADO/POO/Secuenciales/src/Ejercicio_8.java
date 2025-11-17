import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que pida la longitud de dos lados de un rectángulo C1 y C2, y en calcule el perímetro y el área. Calcular la longitud de la diagonal, y después el área del triángulo que forman los dos lados con la diagonal .
		
		DecimalFormat formato = new DecimalFormat("#.00");
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de los dos lados de un rectangulo");
		
		double lado_1=lector.nextDouble();
		double lado_2=lector.nextDouble();
		
		double per= 2*(lado_1+lado_2);
		
		double ar= lado_1*lado_2;
		
		double lon= Math.sqrt(Math.pow(lado_1, 2)+Math.pow(lado_2, 2));
		
		double ar_2=0.5*lado_1*lado_2;
		
		System.out.printf("El perímetro: "+formato.format(per)+" cm\nEl área del rectángulo es: " +formato.format(ar)+ " cm\nLa longitud de la diagonal es: "+formato.format(lon)+" cm\nEl área de los dos lados es: "+formato.format(ar_2));
		
		
		lector.close();
		
		
		
		
		
		
		
		
		
		
	}

}
