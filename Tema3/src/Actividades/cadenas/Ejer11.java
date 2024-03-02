package Actividades.cadenas;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        /*
         * Programa que lee una frase y luego muestra las palabras sueltas (una en cada
         * línea).
         */

        Scanner escaner = new Scanner(System.in);

        String frase;
        int startPos = 0;
        int searcherPos = 0;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();
        

        // mientras que startPos sea menor que la longitud de la frase
        while (startPos < frase.length()) {

            // buscamos el siguiente espacio en blanco
            searcherPos = frase.indexOf(" ", startPos);

            // si no hay más espacios en blanco, posSearcher será -1 y le asignamos la longitud de la frase
            if (searcherPos == -1) {
                searcherPos = frase.length();
            }

            // mostramos la palabra que hay entre startPos y posSearcher
            System.out.println(frase.substring(startPos, searcherPos));
            // actualizamos startPos para que empiece a buscar desde la posición siguiente
            startPos = searcherPos + 1;

        }
        escaner.close();
    }
}
