import java.util.Scanner;

public class PIRÁMIDES {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);


        int num = 4;
        System.out.println("Introduce el tamaño de la pirámide");
        num = sc2.nextInt();



        //VA DENTRO DE ESTE FOR, PIRAMIDE ASCENDENTE
        for (int i = 1; i <= num; i++) {


            //ESTE ES PARA QUE SEA CENTRADO
            for (int e = num; e > i; e--) {
                System.out.print(" ");
            }


            //LA FIGURA QUE QUIERES IMPRIMIR
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }


            //PARA QUE HAGA EL SALTO Y QUE LOS ASTERISCOS HAGAN LA PIRAMIDE
            System.out.println();
        }



        //EMPIEZA A HACER LA PIRAMIDE DESCENDENTE
        for (int i = num; i >= 1; i--) {

            //PARA QUE SEA CENTRADO
            for (int e = num; e > i; e--) {
                System.out.print(" ");
            }

            //PARA IMPRIMIR EL SIMBOLO
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            //PARA QUE HAGA LA FORMA DE LA PIRAMIDE
            System.out.println();
        }


        //EL I=2 ES PARA QUE CUANDO ACABE ANTES CON 1 ESTRELLA, NO PONGA
        // OTRA ESTRELLA, SI NO QUE EMPIECE A IMPRIMIR POR 2
        for (int i = 2; i <= num; i++) {

            //PARA QUE SEA CENTRADO
            for (int e = num; e > i; e--) {
                System.out.print(" ");
            }

            //PARA IMPRIMIR EL SIMBOLO
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            //PARA LA FORMA DE LA PIRAMIDE
            System.out.println();
        }


        //EMPIEZA A HACER LA PIRAMIDE DESCENDENTE
        for (int i = num; i >= 1; i--) {

            //PARA QUE SEA CENTRADO
            for (int e = num; e > i; e--) {
                System.out.print(" ");
            }

            //PARA IMPRIMIR EL SIMBOLO
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            //PARA QUE HAGA LA FORMA DE LA PIRAMIDE
            System.out.println();
        }

    }

}






