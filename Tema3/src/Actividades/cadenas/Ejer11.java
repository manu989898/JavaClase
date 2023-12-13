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
        int posSearcher = 0;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();
        

        // mientras que posEspacio sea menor que la longitud de la frase
        while (startPos < frase.length()) {

            // posEspacioSiguiente es la posición del primer espacio en blanco a partir de posEspacio
            posSearcher = frase.indexOf(" ", startPos);

            // si posEspacioSiguiente es -1, es que no hay más espacios en blanco
            if (posSearcher == -1) {
                posSearcher = frase.length();
            }

            // si la posición de posEspacioSiguiente es igual a la longitud de la frase, es que no hay más
            System.out.println(frase.substring(startPos, posSearcher));
            startPos = posSearcher + 1;

        }
        escaner.close();
    }
}
