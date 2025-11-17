import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Introducir dos números por el teclado, dividendo y divisor. Si dividendo es divisible por divisor, el programa ha de mostrar el mensaje “DIVISIBLES”.
	
	DecimalFormat formato = new DecimalFormat("#.0");
		
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Inroduce un dividento, después un divisor");
	
	double dividendo=lector.nextInt();
	
	double divisor=lector.nextInt();
	
	double resultado=dividendo/divisor;
	
	if (dividendo % divisor ==0){
		System.out.println(+dividendo+" SI es divisible entre "+divisor+ " y que cuyo resultado es "+formato.format(resultado));
	}
	else {
		System.out.println(+dividendo+" NO es divisible entre "+divisor+ " y cuyo resultado es "+formato.format(resultado));
	
	}
	
	lector.close();
	
		
	}
	}
	
	
	
	


