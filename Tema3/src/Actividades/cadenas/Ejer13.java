package Actividades.cadenas;

import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {

        /*
         * Programa que te pide cinco palabras y te dice cuál es la que va primero,
         * alfabéticamente.
         */

        Scanner escaner = new Scanner(System.in);

        String[] palabras = new String[5];
        String palabraMenor = "";

        // pedimos las palabras y las guardamos en el array
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra " + (i + 1) + " :");
            palabras[i] = escaner.nextLine();
        }

        palabraMenor = palabras[0];

        // recorremos el array desde la posición 1 hasta el final
        for (int i = 1; i < palabras.length; i++) {

            // si la palabra en la posición i es menor que la palabraMenor nos dará un resultado negativo
            if (palabras[i].compareTo(palabraMenor) < 0) {

                // actualizamos palabraMenor con la palabra en la posición i
                palabraMenor = palabras[i];
            }
        }
        // mostramos la palabra menor
        System.out.println("La palabra que va primero alfabéticamente es: " + palabraMenor);
        escaner.close();
    }
}
