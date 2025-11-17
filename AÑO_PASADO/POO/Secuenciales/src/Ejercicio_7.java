import java.security.DrbgParameters.NextBytes;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hacer un programa que pida el radio R de una circunferencia, y  calcule la longitud y el área.
	
		DecimalFormat formato = new DecimalFormat("#.00");
		
		double rad;
		double lon;
		double ar;
		
		
		Scanner lector = new Scanner(System.in);
	
		System.out.println("Introduce el radio de la circunferencia");
		
		rad=lector.nextDouble();
		
		lon= 2*Math.PI*rad;
		
		ar= Math.PI*Math.pow(rad, 2);
		
		System.out.println("La longitud de su radio es "+formato.format(lon)+" cm\nEl area de su circulo es " +formato.format(ar)+" cm");
		
		lector.close();
		
		
		
	
	

	
	}
	

}
