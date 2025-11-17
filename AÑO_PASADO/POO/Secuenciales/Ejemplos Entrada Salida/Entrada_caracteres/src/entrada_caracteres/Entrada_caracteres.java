/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_caracteres;
import java.io.*;
/**
 *
 * @author gema
 */
public class Entrada_caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
    //ENTRADA DE DATOS CARACTERES, InputStreamReader, ver librería java.io.*
        char letra;
        InputStreamReader lector= new InputStreamReader(System.in);
        System.out.println("Introduzca una letra");
        letra = (char)lector.read();
        System.out.println("la letra introducida ha sido: "+ letra);
        
    }
}
