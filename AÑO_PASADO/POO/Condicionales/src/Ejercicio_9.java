import java.util.Scanner;
public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Hacer un programa que pida dos números. El programa ha de mirar cual de los dos es el mayor, y después mirar si este número mayor es divisible por el menor; en caso que lo sea ha de restar el mayor del menor,  en caso contrario los ha de sumar.
		        /*
		        Hacer un programa que pida dos números.
		        El programa ha de mirar cual de los dos es el mayor, y después mirar
		        si este número mayor es divisible por el menor; en caso que lo sea ha
		        de restar el mayor del menor,  en caso contrario los ha de sumar."
		        */

		        int num1, num2, aux, resultado;
		        Scanner lector = new Scanner(System.in);

		        System.out.print("Introduce el número 1: ");
		        num1 = lector.nextInt();
		        System.out.println();

		        System.out.print("Introduce el número 2: ");
		        num2 = lector.nextInt();

		        lector.close();

		        //Si son iguales no hago nada
		        if (num1 == num2)
		            System.out.println("Los números son iguales.");
		        else {
		            //Ordeno los números antes de nada, luego sabré siempre que
		            //el primero es el menor
		            if (num1 > num2) {
		                aux = num2;
		                num2 = num1;
		                num1 = aux;
		            }

		            //Compruebo la divisibilidad
		            if ((num2 % num1) == 0)
		                resultado = num1 - num2;
		            else
		                resultado = num1 + num2;

		            System.out.println("El resultado es " + resultado);
		        }
		    }
		}


