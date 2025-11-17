import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int opcion = 0;
        int[][] vacunas = new int[28][2];


        do {
            System.out.println("Selecciona si quieres llenar el array manualmente (introduce '1') o con numeros aleatorios (introduce '2')");
            opcion = sc.nextInt();
        }while (opcion!=1 && opcion!=2);
        for (int i = 0; i < vacunas.length; i++) {
            vacunas[i][0] = i;
        }
        if (opcion==1){
            for (int i = 0; i < vacunas.length; i++) {

                System.out.println("Escribe qué cantidad de vacunas se suministraron el dia " + (i+1));
                vacunas[i][1] = sc.nextInt();
            }
        }else {
            for (int i = 0; i < vacunas.length; i++) {
                vacunas[i][1] = rd.nextInt(100);
            }
            for (int i = 0; i < vacunas.length; i++) {
                for (int j = i+1; j < vacunas.length; j++) {
                    if (vacunas[i][1]==vacunas[j][1])
                        vacunas[j][1] = rd.nextInt(100);
                }
            }

        }

        int[][] vacunas1 = vacunas.clone();
        for (int i = 0; i < vacunas1.length; i++) {
            for (int j = i+1; j < vacunas1.length; j++) {
                if (vacunas1[i][1] < vacunas1[j][1]){
                    int[] aux = vacunas1[i];
                    vacunas1[i] = vacunas1[j];
                    vacunas1[j] = aux;
                }
            }
        }



        int vactotales = 0;
        for (int i = 0; i < vacunas.length; i++) {
            vactotales+=vacunas[i][1];
        }
        System.out.println("La media diaria de vacunas en el mes fue " + (vactotales/vacunas.length));

        int vaclunes = 0, vacmartes = 0, vacmiercoles = 0, vacjueves = 0, vacviernes = 0, vacsabado = 0, vacdomingo = 0;
        for (int i = 0; i < vacunas.length; i+=7) {
            vaclunes += vacunas[i][1];
            vacmartes += vacunas[i+1][1];
            vacmiercoles += vacunas[i+2][1];
            vacjueves += vacunas[i+3][1];
            vacviernes += vacunas[i+4][1];
            vacsabado += vacunas[i+5][1];
            vacdomingo += vacunas[i+6][1];
        }

        System.out.println();
        System.out.println("La media de los lunes fue " + vaclunes/4
        + "\nLa media de los martes fue " + vacmartes/4
        + "\nLa media de los miercoles fue " + vacmiercoles/4
        + "\nLa media de los jueves fue " + vacjueves/4
        + "\nLa media de los viernes fue " + vacviernes/4
        + "\nLa media de los sabados fue " + vacsabado/4
        + "\nLa media de los domingos fue " + vacdomingo/4);


        System.out.println();
        System.out.println("Ordenados cronológicamente: ");
        for (int i = 0; i < vacunas.length; i++) {
            System.out.println("El dia " + (vacunas[i][0]+1) + " se suministraron " + vacunas[i][1] + " vacunas");
        }

        System.out.println();
        System.out.println("Ordenado por cantidad de vacunas:");
        for (int i = 0; i < vacunas1.length; i++) {
            System.out.println("El dia " + (vacunas1[i][0]+1) + " se suministraron " + vacunas1[i][1] + " vacunas");
        }

    }
}

