import java.util.Scanner;
public class Práctica_clase {
    public static void main(String[] args) {
        int num;
        //Declaración
        int calorias[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de dias");
        int dias = sc.nextInt();
        //Creacion
        calorias = new int[dias];
        byte edades[]=new byte[29];
        double salarios [] =new double [12];

        //Carga de datos




        for (int posicion=0;posicion<calorias.length;posicion++){
            System.out.println("Ingresa la cantidad de calorias del dia "+ (posicion+1)+ ":");
            calorias[posicion]=sc.nextInt();
        }




    }
}
