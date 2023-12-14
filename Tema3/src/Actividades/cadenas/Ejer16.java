package Actividades.cadenas;

import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {

        /*
         * Leer una frase y generar su acrónimo (primera letra, en mayúsculas, de cada
         * frase)
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = escaner.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("Acrónimo:");

        for (int i = 0; i < palabras.length; i++) {
            
            System.out.print(palabras[i].charAt(0));
        }
        escaner.close();
    }
}
