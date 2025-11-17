import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hacer un programa que pida N números por teclado, los sume y en calcule la media.	
		
		Scanner lector= new Scanner(System.in);
		
		
		
		double total = 0;
        double num;
        double cont = 9;
        System.out.println("Ingrese numeros, cuando no quiera añadir mas, pulse 0");
        do {
            num = lector.nextInt();
            total = total + num;
            cont++;
        } while (num != 9);
        double media = total/(cont-1);
        System.out.println("La media es: " + media);
		
	}

}
