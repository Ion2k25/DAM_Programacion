import java.util.Scanner;
public class Ej_5 {
    public static void main(String[] args) {

        /*
        5.	Hacer un programa que introduciendo un número del 1 al 7, diga si corresponde a lunes,
        martes, miércoles, ... Si el número no está comprendido entre 1 y 7, ha de mostrar un
        mensaje avisando que no puede decir el día.
         */

        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero =sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es ningun dia de la semana");
                break;

        }
    }
}
