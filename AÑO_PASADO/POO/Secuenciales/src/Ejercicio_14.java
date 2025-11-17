import java.util.Scanner;
public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*14.	Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
		55% del promedio de sus tres calificaciones parciales.
		30% de la calificación del examen final. 
		15% de la calificación de un trabajo final.*/
		
		double parcial1;
		double parcial2;
		double parcial3;
		double fin;
		double trabajo;
		double cal_fin;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce las tres calificaciones de sus examenes parciales");
		
		parcial1= lector.nextDouble();
		parcial2=lector.nextDouble();
		parcial3=lector.nextDouble();
		
		System.out.println("Introduce la calificacion del examen final");
		
		fin=lector.nextDouble();
		
		System.out.println("Inotrouce la nota final del trabajo");
		
		trabajo=lector.nextDouble();
		
		cal_fin= ((parcial1+parcial2+parcial3)/3)*0.55 + fin*0.3 + trabajo*0.15;
		/*cal_fin= fin*0.3;
		cal_fin= trabajo*0.15;*/
//		Preguntar porque si lo hago de esa manera, no funciona.
		
		System.out.println("Su calificacion del final de curso sería "+cal_fin++);
		
		lector.close();
		
		
		
		
		
		
		
		
		
		

	}

}
