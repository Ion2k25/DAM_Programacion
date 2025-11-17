import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hacer un programa que introduciendo un número del 1 al 7, diga si corresponde a lunes, martes, miércoles, ... Si el número no está comprendido entre 1 y 7, ha de mostrar un mensaje avisando que no puede decir el día.
	
		
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce un numero");

	int numero=lector.nextInt();
	
	if(numero>0 && numero<8) {
	}
	else {
		System.out.println("Debe introducir un numero comprendido entre 1 y 7");
	}
	switch(numero) {
	case 1:
		System.out.println("Estamos a Lunes");
		break;
	case 2:
		System.out.println("Estamos a Martes");
		break;
	case 3:
		System.out.println("Estamos a Miercoles");
		break;
	case 4:
		System.out.println("Estamos a Jueves");
		break;
	case 5:
		System.out.println("Estamos a Viernes");
		break;
	case 6:
		System.out.println("Estamos a Sabado");
		break;
	case 7:
		System.out.println("Estamos a Domingo");
	break;
		
	}
	lector.close();
	
	}
	
	
	
	}


