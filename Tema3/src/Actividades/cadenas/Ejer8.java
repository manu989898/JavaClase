package Actividades.cadenas;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {

        /*
         * Programa que lee una frase desde el teclado y nos muestra la primera palabra
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("introduce una frase: ");
        String frase = escaner.nextLine();

        System.out.println("\nLa primera palabra de la frase es: " );

        for (int i = 0; i < frase.length() ; i++) {

            System.out.print(frase.charAt(i));
            if (frase.charAt(i) == ' '){

                break;
            }
        }
        escaner.close();
    }
}
