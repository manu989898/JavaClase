package Ejemplos;

import java.util.Scanner;

public class GuardarDatosEnArray {
    public static void main(String[] args) {
        
        /*
         *  ****** RELLENAR UN ARRAY DESDE EL TERMINAL ******
         * 
         *  nombres { [] [] [] [] }
         *     i      0  1  2  3 
         * 
         * Crearemos un bucle que recorra el array y en ese bucle crearemos la prgunta y 
         * la guararemos en el indice del array
         * 
         *  for (int i=0; i<nombres.lenght; i++) {
         *       sysout("Pregunta")
         *       
         *  }
         * 
         */

        Scanner escaner = new Scanner(System.in);

        String nombres [] = new String [4];

        for (int i = 0; i < nombres.length; i++) {
        
            System.out.println("Ingresa el nombre");
            nombres[i] = escaner.nextLine();

        }

        for (int i = 0; i < nombres.length; i++) {
        
            System.out.println(nombres[i]);
        
        }
        escaner.close();
    }
}
