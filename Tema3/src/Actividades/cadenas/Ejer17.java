package Actividades.cadenas;

import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {
        /*
         * Programa que lee una frase desde el teclado y la muestra quitando la última palabra.
         */

        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String frase = escaner.nextLine();

        // Separamos la frase en palabras y las guardamos en un array.
        String[] palabras = frase.split(" ");
        String fraseSinUltimaPalabra = "";

        // Recorremos el array de palabras hasta la penúltima.
        for (int i = 0; i < palabras.length - 1; i++) {
            fraseSinUltimaPalabra += palabras[i] + " ";
        }
        System.out.println("Frase sin la última palabra: " + fraseSinUltimaPalabra);
        escaner.close();
    }
}
