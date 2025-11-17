

public class Ej_8 {
    static void main(String[] args) {
        /*
        8.	Hacer un programa que muestre los números del 1 al 200 que sean divisibles por 2 y 3.
         */


       /* int i=1;

        do{
            if(i%2==0 && i%3==0){
                System.out.println(i++);
            }

        }while(i<=200);*/

        for(int i=1;i<=200;i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }

        }

    }
}
