package Actividades.cadenas;

import java.util.Scanner;

public class Practicasmias {
    public static void main(String[] args) {
        /*
         * Actividad 17: Programa que lee una frase desde el teclado y la muestra quitando la última palabra usando solo el metodo main */
         
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce una frase y te la mostraré quitando la última palabra");
        String frase = escaner.nextLine();

        String fraseSinUltimaPalabra = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                fraseSinUltimaPalabra = frase.substring(0, i);
            }
        }
        System.out.println(fraseSinUltimaPalabra);
             
        
        //Coger una cadena y poner la primera letra de cada palabra en mayúsculas.

        System.out.println("Ingresa una frase y convertiré la primera palabra en MAYUS");
        String frase1 = escaner.nextLine();
        
        System.out.print(Character.toUpperCase(frase1.charAt(0)));
        for (int i = 1; i < frase.length(); i++) {
            
            if (frase1.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(frase1.charAt(i + 1)));
                i++;
            
            } else {
                System.out.print(frase1.charAt(i));
            }
        }
        escaner.close();
    }
}
