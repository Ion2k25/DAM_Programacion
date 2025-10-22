package STRINGS;

import java.util.Scanner;

public class Explicaciones {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        //DECLARACIONES

        String nombre = "Juanito";
        var apellido =new String("Gutierrez");

        /*
        System.out.println("Introduce tu apellido");
        var apellido = sc.nextLine();
        */


        System.out.println("----------------------------\n");
        //OPERACIONES BÁSICAS

            //NO se puede restar una cadena de texto
        System.out.println("Tu nombre es: "+nombre +"\nTu apellido es: "+apellido +"\n");



        System.out.println("----------------------------\n");
        //CONCATENACIONES

            //LONGITUD:Te devuelve en int la longitud de la cadena
        System.out.println("La longitud de tu nombre es: "+nombre.length()+ "\nLa longitud de tu apellido es: "+apellido.length()+"\n");



        System.out.println("----------------------------\n");
        //OBTENER CARACTER:Te da el carácter que tu le digas

                //IMPORTANTE: El valor 0 es el que corresponde a la PRIMERA letra
        System.out.println("La primera letra de tu nombre es: "+nombre.charAt(0));
        System.out.println("La segunda letra de tu nombre es: "+nombre.charAt(1));
        System.out.println("La última letra de tu nombre es: "+nombre.charAt(nombre.length()-1)
                            +"\nPero tambien se puede adivinar de esta manera: "+nombre.charAt(6)+"\n");




        System.out.println("----------------------------\n");
        //SUBCADENAS/SUBSTRINGS
        System.out.println("Desde donde le indiques, hasta el final: "+nombre.substring(2));
                //Aqui le estas indicando el valor donde empezara y el final donde acabará
        System.out.println("Tu le indicas desde donde hasta donde: "+nombre.substring(2,4)+"\n");



        System.out.println("----------------------------\n");
        //TRANSFORMAR A MAYUSCULAS Y MINÚSCULAS
        System.out.println("Nombre en MAYUSCULAS: "+nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: "+nombre.toLowerCase()+"\n");




        System.out.println("----------------------------\n");
        //COMPROBAR QUE CONTIENE LA CADENA
        System.out.println("Buenos días".contains("Adios")); //FALSE
        System.out.println("Buenos días".contains("uenos")+"\n"); //TRUE




        System.out.println("----------------------------\n");
            //Concatenando diferentes operaciones
        System.out.println("Hola,Java".contains("AVA")); //FALSE, porque tiene que coincidir
        System.out.println("Hola, Java".toUpperCase().contains("AVA")); //TRUE




        System.out.println("----------------------------\n");
        //COMPARACIÓNES
        System.out.println(nombre.equals("Juanito"));//TRUE
        System.out.println(nombre.equals("JUANITO"));//FALSE
        System.out.println(nombre.equalsIgnoreCase("JUANito")); //TRUE, ignora como son las letras, lo principal esque coincidan

            // == vs equals
            var a = "Jose";
            var b = "Jose";
            var c = new String("Jose");

            System.out.println(a == b); //TRUE
            System.out.println(a == c); //FALSE porque compara "metodos/clases" por eso a y b si que son iguales el c no
            System.out.println(a.equals(c)); //TRUE




        System.out.println("----------------------------\n");
        //OPERACION DE LIMPIEZA/REEMPLAZO
            //Trim
            System.out.println("        Buenas,me llamo Ion        ".trim()); //Elimina espacios del principio y final SOLAMENTE

            //Replace
            System.out.println("    Buenas,   me llamo     Ion  ".replace(" ", "")); //Te quita TODOS los espacios
            System.out.println("Buenas, me llamo Ion".replace("Ion", "Juanito\n"));

            //Format
            var edad= 24;
            System.out.println(String.format("Buenas, me llamo %s, tengo %d años", nombre, edad));
            //EXPLICACION: Lo que estas haciendo es, asignarle como una variable, que va a cambiar cada vez que esa
                   //variable se cambie, no hace falta que se escriba otro System.out. Cuando cambie el valoe de nombre, se cambiara automaticamente
                    //%s --> Es para las cadenas de texto
                    //%d --> Es para los enteros
                    //%f --> Es para los decimales
                    //HAY MUCHISIMOS MÁS


    }
}
