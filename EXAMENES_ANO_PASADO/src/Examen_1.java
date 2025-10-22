import java.util.Scanner;

public class Examen_1 {
    public static void main(String[] args) {
        /*
        Los alumnos de 1DAM del IES Francisco de Quevedo son los encargados de la gestión de la
        Oficina de Correos del distrito de San Blas.

        Para ello deben realizar un programa que pueda ser utilizado por dos tipos de usuario, el cliente y el
        trabajador de correos. El cliente utilizará el programa para obtener el ticket de envío o recogida
        de paquetes. El trabajador utilizará el programa para ver cuántos paquetes se han enviado y
        recogido desde que arrancó el programa.

        Para ello el programa presentará un menú:
        1, Cliente
        2. Trabajador
        3. Salir

        Si el usuario introduce 1, el programa le mostrará las opciones:

        A Enviar
        B Recoger
        C Salir (el programa volverá al menú anterior)

        Si el usuario introduce 2 el programa le mostrará directamente el número de paquetes enviados,
        el número de paquetes recogidos así como el % que representa cada uno respecto del total.
        Los menús se mostrarán hasta que el usuario introduzca una opción correcta y
        sólo si introduce la opción 3 se parará el programa.

        En la opción A, el programa le mostrará al usuario un código que será "ENV001", o "ENV002"
        siendo el número incrementado cada vez que se genere un ticket de envío de paquete. En la opción
        B, el programa le mostrará al usuario un código que será "RECO01", o "REC002" siendo el
         número incrementado cada vez que se genere un ticket de recogida de paquete.
          */

        /*
        Programa que muestre un menú al usuario en el que le permita elegir
        entre las siguientes opciones:

        a.
        Ascensor. El programa solicita al usuario tres datos: si desea subir o
        bajar (s para subir b para bajar), planta actual y planta destino.
        El programa debe hacer control de entrada de forma que si el usuario quiere subir pero
        introduce una planta destino inferior a la actual, debe decirle que para subir la planta actual debe ser inferior que la de
        destino y volver a pedir los datos. El programa una vez que tiene los tres datos coherentes mostrará las plantas que recorre desde
        la actual a la de destino. Ejemplo:
        Entrada: s 5 1
        Salida: plantas incorrectas, para subir la planta destino debe ser mayor
        Entrada: s 5 10
        Salida: 6 78 9 10 Ha llegado a su destino.

        b.
        Amigos. Opción que pida al usuario que introduzca dos números. El
        programa dirá si los números son amigos o no. Dos números son amigos cuando la suma de los
        divisores de uno es igual al otro y recíprocamente.
        Ejemplo: los números 220, 284 son amigos ya que los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110,
        que suman 284 y los divisores propios de 284 son 1, 2, 4, 71 y 142, que suman 220.

        C.
        La más larga. El programa pide al usuario que introduzca una frase. El programa indicará el número de caracteres de la palabra más
        larga introducida por el usuario y qué lugar ocupaba en la frase. Ejemplo: Hoy hace calor. La palabra más
        larga tiene 5 caracteres y ocupa el puesto 3.

        d.
        Salir
         */
        int menu = 0;

        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENÚ USUARIO: \n 1.Ascensor \n 2.Numeros amigos \n 3.Cadena más larga\n\n");
            System.out.println("Introduce una opción");
            menu = sc.nextInt();
        } while (menu != 4);


        switch (menu) {
            case 1:
                boolean valida = false;
                char opcion = 0;
                int planta_actual = 0, planta_destino = 0;

                do {
                    System.out.println("Pulse s para subir o b para bajar");
                    opcion = sc.next().charAt(0);
                }
                while (opcion != 's' && opcion != 'b');
            {
            }

            if (opcion == 's') {

                do {
                    System.out.println("Introduce la planta actual");
                    planta_actual = sc.nextInt();
                    System.out.println("Introduce la planta de destino");
                    planta_destino = sc.nextInt();
                    if (planta_actual > planta_destino) {
                        System.out.println("Para subir, tiene que introducir una planta mayor que la actual");

                    }
                }
                while (planta_actual > planta_destino);
                {

                }
                do {
                    System.out.println("Usted esta subiendo..." + planta_actual++);
                }
                while (planta_actual < planta_destino);
                {


                    if (planta_actual >= planta_destino) {
                        System.out.println("HA LLEGADO A SU PLANTA " + planta_destino);

                    }

                }

            }

            if (opcion == 'b') {
                do {
                    System.out.println("Introduce la planta actual");
                    planta_actual = sc.nextInt();
                    System.out.println("Introduce la planta de destino");
                    planta_destino = sc.nextInt();
                    if (planta_actual < planta_destino) {
                        System.out.println("Para bajar, tiene que introducir una planta menor que la actual");

                    }
                }
                while (planta_actual < planta_destino);

                {

                }
                do {
                    System.out.println("Usted esta bajando..." + planta_actual--);
                }
                while (planta_actual > planta_destino);
                {


                    if (planta_destino <= planta_destino) {
                        System.out.println("Ha llegado a su planta " + planta_destino);

                    }
                }

            }
            break;

            case 2:
                /*
                Amigos. Opción que pida al usuario que introduzca dos números. El
        programa dirá si los números son amigos o no. Dos números son amigos cuando la suma de los
        divisores de uno es igual al otro y recíprocamente.
        Ejemplo: los números 220, 284 son amigos ya que los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110,
        que suman 284 y los divisores propios de 284 son 1, 2, 4, 71 y 142, que suman 220.
                 */

                System.out.println("Introduce 1 número");
                int num_1 = sc.nextInt();
                System.out.println("Introduce 1 número");
                int num_2 = sc.nextInt();
                int suma1 = 0;
                for (int i = 1; i < num_1; i++) {
                    if (num_1 % i == 0) {
                        suma1 += i;
                    }
                }
                int suma2 = 0;
                for (int i = 1; i < num_2; i++) {
                    if (num_2 % i == 0) {
                        suma2 += i;
                    }
                }

                // Comprobar si son amigos
                if (suma1 == num_2 && suma2 == num_1) {
                    System.out.println(num_1 + " y " + num_2 + " son números amigos.");
                } else {
                    System.out.println(num_1 + " y " + num_2 + " NO son números amigos.");
                }


                break;

            case 3:
                /*
                La más larga. El programa pide al usuario que introduzca una frase. El programa indicará el número de caracteres de la palabra más
                larga introducida por el usuario y qué lugar ocupaba en la frase. Ejemplo: Hoy hace calor. La palabra más
                larga tiene 5 caracteres y ocupa el puesto 3.
                 */


                break;


        }

    }

}

