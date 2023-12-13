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
        int i = 0;
        int j = 0;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();
        

        // mientaRs que i sea menor que la longitud de la frase
        while (i < frase.length()) {

            // j es la posición del primer espacio en blanco a partir de i
            j = frase.indexOf(" ", i);

            // si j es -1, es que no hay más espacios en blanco
            if (j == -1) {
                j = frase.length();
            }

            // si la posición de j es igual a la longitud de la frase, es que no hay más
            System.out.println(frase.substring(i, j));
            i = j + 1;

        }
        escaner.close();
    }
}
