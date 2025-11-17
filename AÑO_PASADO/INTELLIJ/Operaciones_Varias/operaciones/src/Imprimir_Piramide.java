public class Imprimir_Piramide {

    public static void imprimirPiramide(int filas){
        for (int i=1; i<=filas;i++){
            for(int j=1; j<=filas - i;j++){
                System.out.print(" ");//Imprime espacios para centrar la pirámide
            }
        for(int k=1; k<=(2+i-1);k++){
            System.out.print("*");//Imprime los asteriscos
        }
        System.out.println();//Salta a la siguiente línea

        }
    }
}
