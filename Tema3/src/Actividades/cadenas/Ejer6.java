package Actividades.cadenas;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {

        /*
         * Programa que pide una frase y dos letras. A continuación muestra la frase
         * sustituyendo la primera letra por la segunda.
         */

        Scanner escaner = new Scanner(System.in);

        String frase;
        String letra1;
        String letra2;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();

        System.out.println("Introduce la letra que quieres sustituir: ");
        letra1 = escaner.nextLine();

        System.out.println("Introduce la letra por la cual se va a sustituir: ");
        letra2 = escaner.nextLine();

        // Reocrremos la cadena de atrás hacia adelante
        for (int i = 0; i < frase.length(); i++) {

            // Si la letra en la posición i es igual a la letra1
            if (frase.charAt(i) == letra1.charAt(0)) {
                
                // Se mostrará la letra2
                System.out.print(letra2.charAt(0));
            } else {
                
                // Si no, se mostrará la letra en la posición i
                System.out.print(frase.charAt(i));
            }
        }
        escaner.close();
    }
}
