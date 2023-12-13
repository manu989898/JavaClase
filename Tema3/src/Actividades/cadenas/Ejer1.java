package Actividades.cadenas;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        /*
         * Programa que lea una palabra desde la terminal y te diga cuántas letras tiene.
         */

        Scanner escaner = new Scanner(System.in);
        int longitud;

        System.out.println("Introduce una palabra: ");
        String palabra = escaner.nextLine();
        longitud = palabra.length();
        System.out.println("La palabra " + palabra + " tiene " + longitud + " letras (contando espacios).");
        escaner.close();
    }
}
