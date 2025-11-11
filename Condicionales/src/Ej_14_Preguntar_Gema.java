import java.util.Scanner;
public class Ej_14_Preguntar_Gema {
    public static void main(String[] args) {
        /*
        14.	Hacer un programa que pida cuatro números A, B, C y D; el programa ha de sumarlos
        si A/B > C/D sino,  ha de sumar sólo B y D. En caso que B = 0, o D = 0 el programa ha de
        mostrar un mensaje avisando que no se puede dividir por 0; en tal caso no ha de hacerse
        ninguna operación.
         */

        Scanner sc = new Scanner(System.in);


        //He leido que es porque tiene que ser double, pero al parecer no es por eso
        //BASICAMENTE, es porque si pones esto if (a/b > c/d) de primeras, te da ese error, PORQUEEE?
        System.out.println("Introduce 4 numeros");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();

        if (a/b > c/d) {
            double suma = a + b + c + d;
            System.out.println(suma);
        }

     /*   if (b == 0 || d == 0) {
            System.out.println("No se puede dividir por 0");

        } else if (a/b > c/d) {
                int suma = a + b + c + d;
                System.out.println(suma);


            }
         else {
            int suma_2 = b + d;
            System.out.println(suma_2);


        }

      */

    }
    }
