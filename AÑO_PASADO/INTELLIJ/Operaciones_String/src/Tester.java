import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nombre_Apellidos
        System.out.println("Introduce tu nombre: ");
        String Nombre = scanner.nextLine();
        System.out.println("Introduce tu apellido: ");
        String Apellido = scanner.nextLine();

        String iniciales=Nombre_Apellido.Iniciales(Nombre,Apellido);
        System.out.println("Iniciales: "+iniciales);

        scanner.close();

    }
}
