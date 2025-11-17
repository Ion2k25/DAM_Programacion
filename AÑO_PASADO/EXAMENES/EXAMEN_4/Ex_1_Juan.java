import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        // Declaración de variables y objetos
        int opcion;
        int sumaDivisores;
        char vocal;
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
        int[] contadorVocales = new int[5];
        int totalVocales;
        StringBuilder secuenciaOpciones = new StringBuilder();
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("===================");
            System.out.println("OPCIONES DE USUARIO");
            System.out.println("===================");
            System.out.println("1. Números deficientes del 1 al 100");
            System.out.println("2. Contabilizar la proporción de vocales");
            System.out.println("3. Mostrar secuencia de opciones ejecutadas");
            System.out.println("4. Resetear secuencia de opciones");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Seleccione una opción del menú -> ");
            opcion = lector.nextInt();

            // Si la opción es correcta, la añado a la secuencia
            // La opción 5 no la contemplo porque no se podría ver
            // una vez finalizado el programa
            // La propia opción 3 la contemplo porque entiendo que
            // es una opción válida y debe estar en la secuencia
            // Si no se quiere contemplar bastaría con filtrarla
            // en el if del siguiente modo:
            // if (((opcion >=1) && (opcion <=4)) && (opcion !=3))
            // La opción 4 también se contempla, aunque nunca se
            // podrá ver que se haya pulsado porque es la de reset
            // Si no se quiere contemplar se puede filtrar análogamente
            // en el if igual que la anterior.
            if ((opcion >= 1) && (opcion <= 4))
                secuenciaOpciones.append(opcion).append(" ");

            // Determino que hacen según la opción
            switch (opcion) {
                case 1:
                    //Recorro todos los números de 1 a 100
                    for (int i = 1; i <= 100; i++) {
                        // Calculo la suma de los divisores del
                        // número con el que trabajo (sin incluir
                        // el propio número)
                        sumaDivisores = 0;
                        for (int j = 1; j <= i - 1; j++)
                            if (i % j == 0)
                                sumaDivisores += j;

                        // Si la suma de los divisores es menor que el número
                        // es que deficiente y lo indico
                        if (sumaDivisores < i)
                            System.out.println("El número " + i + " es deficiente porque es menor que la suma de sus divisores, que es " + sumaDivisores);
                    }
                    break;

                case 2:
                    // Inicializo el contador de vocales
                    // Uso un array para contabilizar porque no
                    // se indica nada en el enunciado  sobre que
                    // estructura usar para ello
                    for (int i= 0; i <=contadorVocales.length-1 ; i++)
                        contadorVocales[i]=0;

                    // Introduzco el texto por teclado
                    System.out.println("Introduzca un texto por teclado y termine en *:");

                    // Repito mientras no encuentre el caracter de fin
                    do {
                        vocal = (char) System.in.read();

                        // Contabilizo las vocales
                        switch (vocal) {
                            case 'a':
                            case 'A':
                                contadorVocales[0]++;
                                break;

                            case 'e':
                            case 'E':
                                contadorVocales[1]++;
                                break;

                            case 'i':
                            case 'I':
                                contadorVocales[2]++;
                                break;

                            case 'o':
                            case 'O':
                                contadorVocales[3]++;
                                break;

                            case 'u':
                            case 'U':
                                contadorVocales[4]++;
                                break;
                        }

                    } while (vocal != '*');

                    //Hago una lectura vacía para eliminar el último enter
                    System.in.read();

                    // El total de vocales lo obtengo de la suma de todas las vocales
                    // encotradas, así no tengo que ir contabilizando en cada case o
                    // usar un if para filtrar en cada iteración del do
                    totalVocales=0;
                    for (int i= 0; i <=contadorVocales.length-1 ; i++)
                        totalVocales+=contadorVocales[i];

                    // Ahora muestro el resultado
                    for (int i= 0; i <=contadorVocales.length-1 ; i++)
                        if (contadorVocales[i] >0)
                            System.out.println("Ha introducido " + contadorVocales[i] + " " + vocales[i] + " de " + totalVocales + " vocales introducidas");
                    break;

                case 3:
                    // Muestro la la secuencia de opciones
                    System.out.println("La secuencia de opciones es: " + secuenciaOpciones);
                    break;

                case 4:
                    // Reseteo la secuencia de opciones
                    // No guardo la propio opción recien pulsada
                    secuenciaOpciones.setLength(0);
                    break;

                case 5:
                    //La opción 5 la contemplo para que no se muestr el mensaje de opción incorrecta
                    break;

                default:
                    System.out.println("Ha seleccionado una opción incorrecta");
                    break;
            }

        } while (opcion != 5);


    }
}