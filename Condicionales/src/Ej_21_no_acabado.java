import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Ej_21_no_acabado {
    static void main(String[] args) throws IOException {
        /*
        21.	Se desea obtener la nómina semanal (salario neto) de los empleados de
        una empresa cuyo trabajo se paga por horas de la siguiente manera:
	        -Las hora inferiores o iguales a 35 a una tarifa determinada (9€)
	        -Las horas extras se pagan un 15% más que las normales.
	        -Los impuestos a deducir varían en función del sueldo salario_mensual:
	        -Si es menor de 1.262€ libre de impuestos
	        -Las siguientes 270€ al 20%
	        -El resto al 30%
        En la pantalla final debe aparecer el nombre del trabajador, las horas
        trabajadas el mes, lo que cobrará desglosado en sueldo bruto y retenciones.

         */

        Scanner sc=new Scanner(System.in);
        InputStreamReader lector=new InputStreamReader(System.in);


        System.out.println("Cual es tu incial?");
        char nombre=(char)lector.read();
        nombre=Character.toUpperCase(nombre);
        System.out.println("Introduce tus horas trabajadas");
        int horas=sc.nextInt();
        double salario_semanal;

            if (horas <= 35) {
                salario_semanal = horas * 9;
            } else {
                salario_semanal = (horas * 9) + (9 * 0.15);
            }

        double salario_mensual=salario_semanal*4;
        double retencion=0;
        double total=salario_mensual-retencion;

            if(salario_mensual<1262){

            }else if(salario_mensual>=1262 && salario_mensual<=1532){
                retencion=salario_mensual-(salario_mensual*0.2);

            }else{
                retencion=salario_mensual-(salario_mensual*0.3);
            }

            System.out.println("Tu nombre empieza por "+nombre);
            System.out.println("Trabajaste "+horas+ " horas este mes");
            System.out.printf("Cobrarás %.1f%n",total," €" );
            System.out.println("Te han retenido "+retencion);

    }
}
