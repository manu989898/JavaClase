package Actividades.cadenas;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {

        /*
         * Programa que lee una frase desde el teclado y la muestra quitando la primera
         * palabra
         */

        Scanner escaner = new Scanner(System.in);
        boolean saltadaPalabra = false;
        System.out.println("introduce una frase: ");
        String frase = escaner.nextLine();
        escaner.close(); 

        System.out.println("\nLa primera palabra de la frase es: " );

        
        for (int i = 0; i < frase.length() ; i++) {

            if (frase.charAt(i) == ' ' && !saltadaPalabra){
                saltadaPalabra = true;
        
            } else if (saltadaPalabra){ 
                System.out.print(frase.charAt(i));  
            }   
        }
    }
}
