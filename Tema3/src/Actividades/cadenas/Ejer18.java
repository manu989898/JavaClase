package Actividades.cadenas;

import java.util.Scanner;

public class Ejer18 {
    public static void main(String[] args) {
        /*
         * Coger una cadena y poner la primera letra de cada palabra en mayúsculas.
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = escaner.nextLine();

        // Separamos la frase en palabras y las guardamos en un array.
        String[] palabras = frase.split(" ");
        String fraseMayusculas = "";

        // Recorremos el array de palabras.
        for (int i = 0; i < palabras.length; i++) {
            
            // Guardamos la primera letra de la palabra en mayúsculas.
            // En este caso seria 0,1 porque el 1 no está incluido.
            String primeraLetra = palabras[i].substring(0, 1).toUpperCase();
            
            // Guardamos el resto de la palabra en minúsculas.
            String restoPalabra = palabras[i].substring(1).toLowerCase();
            
            // Concatenamos la primera letra en mayúsculas con el resto de la palabra en minúsculas.
            fraseMayusculas += primeraLetra + restoPalabra + " ";
        }
        System.out.println("Frase con la primera letra de cada palabra en mayúsculas: " + fraseMayusculas);
    }
}
