package EXAMEN_1;

import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Problema_1 {
    static void main(String[] args) throws IOException {

                                             /*FINALIZADO*/



        /*

        Los alumno de 1DAM  del IES Francisco de Quevedo son los encargados de la gestión de la OFicina de Correos del distrito de San Blas.

        Para ello deben realizar un programa que pueda ser utilizado por dos tipos de usuario, el cliente y el trabajador de correos.
        El cliente utilizará el programa para obtener el ticket de envío o recogida de paquetes.
        El trabajador utilizará el programa para ver cuántos paquetes se han enviado y recogido desde que arrrancó el programa.
        Para ello el programa presentará un menú.

        1.Cliente
        2.Trabajador
        3.Salir

        Si el usuario introduce 1, el programa le mostrará las opciones:

        A. Enviar
        B. Recoger
        C. Salir (el programa volverá al menú anterior)

        Si el usuario introduce 2 el programa le mostrará directamente el número de paquetes enviados, el número de paquetes recogidos
        así como el % que representa cada uno respecto al total.
        Los menús se mostrarán hasta que el usuario introduzca una opción correcta y sólo si introduce la opción 3 se parará el programa.

        En la opcion A, el programa le mostrará al usuario un código que será "ENV001", o "ENV002", siendo el número incrementado cada vez que se
        genere un ticket de envío de paquete. En la opción B, el programa le mostrará al usuario un código que será "REC001" o "REC002" siendo el número
        incrementado cada vez que se genere un ticket de recogida de paquete.

         */

        Scanner sc = new Scanner(System.in);
        InputStreamReader lector = new InputStreamReader(System.in);

        char letra;
        int opcion;
        int enviados = 0;
        int recogidos = 0;
        double porcentaje_env;
        double porcentaje_reco;
        double total;

        do {
            System.out.println("+---------------------+\n|    MENU  CORREOS    |\n+---------------------+\n1.Cliente \n2.Trabajador\n3.Salir\n");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                                      do {
                                            System.out.println("\nA.ENVIAR\nB.RECOGER\nC.SALIR");
                                            (letra) = (char) lector.read();
                                            lector.read();                  //Leer el enter pero no lo almacena para que no salga dos veces el menu.
                                            letra = Character.toUpperCase(letra);



                                    switch (letra) {

                                        case 'A':
                                            System.out.printf("ENV%03d\n",enviados);
                                            enviados++;
                                            break;
                                        case 'B':
                                            System.out.printf("ENV%03d\n",recogidos);
                                            recogidos++;
                                            break;

                                                  }
                                        }while(letra!='C');

                   break;

                case 2:
                    total = enviados + recogidos;
                    porcentaje_env = (enviados/total)*100;
                    porcentaje_reco = (recogidos / total)*100;

                    System.out.printf(
                                    "Se han enviado %d y representa el %.0f%% %n" +
                                    "Se han recogido %d y representa el %.0f%% %n",
                            enviados, porcentaje_env,
                            recogidos, porcentaje_reco
                    );

                    break;
            }

        }while(opcion!=3);
        System.out.println("+---------------------+\n|      FIN MENU       |\n+---------------------+");
    }


}
