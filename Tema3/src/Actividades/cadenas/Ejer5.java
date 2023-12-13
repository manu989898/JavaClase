package Actividades.cadenas;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {

        /*
         * Programa que lee una frase y nos dice por cuántas palabras está formada. y que no cuente mas de un espacio junto
         */
        Scanner escaner = new Scanner(System.in);

        String frase;
        int contador = 1;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();

        // Eliminamos los espacios al principio y al final
        frase = frase.trim();

        // Recorremos la cadena
        for (int i = 0; i < frase.length(); i++) {

            // Si hay un espacio y el siguiente caracter no es un espacio contara +1 palabra
            if ((frase.charAt(i) == ' ') && (frase.charAt(i + 1) != ' ')) {
                contador++;
            }
        }

        System.out.println("La frase consta de: " + contador + " palabras.");
        escaner.close();
    }
}
