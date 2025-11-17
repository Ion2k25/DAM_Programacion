import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class Prueba_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%d\n", 62);
//		El printf, sirve para que le des los valores que tu quieras, por ejemplo, quiero que tenga 3 o 5 decimales, etc.Sin salto de línea, tienes que poner \n.
		System.out.printf("%.100f\n",Math.PI);
//		el .12 antes de la f, indica los decimiales que quieres que tenga el número.
		
		System.out.print("Buenas, serían 34€.\n");
//		El print, imprime pero sin salto de línea. el \n hace el salto.
		
		System.out.println("Buenas, tienes melones?");
//		El println, imprime pero con salto de línea.
		
		System.out.println('h');
		System.out.print('s');
//		Las comillas unicas, solamente son para carácteres, es decir, solo 1 carácter, no puedes poner ´hh´, tiene que ser ´h´.
		
		
		
		
		Scanner agua = new Scanner(System.in);
		
		String Silla = agua.next();
		
		System.out.println("Buenas " + Silla + "?");
		
//		Primero, defines el scanner con el nombre que quieras, poronga, despues vuelves a darle valor, coño, para que asi puedas utilizarlo en los ejercicios.
		
		String silla= agua.nextLine();
		System.out.println("Buenas "+Silla+"??");
		
		
		System.out.println("Introduce un número: ");
		int num = agua.nextInt();
		// lo imprimimos
		System.out.println(num);
		
		
		
		
	}

}
