import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		
		double salario;
		double sal_fin;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca su primer salario");
		
		salario=lector.nextDouble();
		
		sal_fin = salario +(salario*0.25);
		
		
		System.out.println("Su salario incrementado seria " +formato.format(sal_fin));
		
		
		lector.close();
		
		
	}

}
