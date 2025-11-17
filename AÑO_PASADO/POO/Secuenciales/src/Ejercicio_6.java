import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Hacer un programa que, dada una cantidad de euros introducida desde teclado, la distribuya en billetes de 10, 5 euros y monedas de 50, 10, 5 y 1 céntimos.
		
		Scanner lector = new Scanner(System.in);
		
		double dinero;
		int billetes_10;
		int billetes_5;
		int centimos_50;
		int centimos_10;
		int centimos_5;
		int centimos_1;
		
		System.out.println("Introduzca la cantidad de dinero");
		
		dinero=lector.nextDouble();
		
		billetes_10=(int)(dinero/10);
		
		billetes_5=(int)((dinero%10)/5);
		
		centimos_50= (int) (((dinero%10)%5)/0.50);
		
		centimos_10= (int) ((((dinero%10)%5)%0.50)/0.10);
		
		centimos_1=(int)(((((dinero%10)%5)%0.50)%0.10)/0.01);
		
		
		
		
		
		System.out.println("Billetes de 10€: " +billetes_10+ "\nBilletes de 5€: "+billetes_5+ "\nMonedas de 50cent: "+centimos_50+ "\nMonedas de 10cent: " +centimos_10+ "\nMonedas de 1cent: " +centimos_1++);
		
		lector.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
