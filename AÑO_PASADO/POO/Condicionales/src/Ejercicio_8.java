import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Dados dos números, dar la relación entre ellos. Señalar el mayor, el menor o especificar si son iguales
		
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Introduce dos numeros");
	
    int num1 = lector.nextInt();
    int num2 = lector.nextInt();

    if (num1 == num2)
        System.out.println("Son iguales");
 
    else {
        if (num1 > num2)
            System.out.println(num1 + " es el mayor");
        else
            System.out.println(num1 + " es el menor");

        if (num1 < num2)
            System.out.println(num2 + " es el mayor");
        else
            System.out.println(num2 + " es el menor");
    }
		
	lector.close();
	
	
	}
}


