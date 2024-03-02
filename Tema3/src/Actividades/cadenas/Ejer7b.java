package Actividades.cadenas;

import java.util.Scanner;

public class Ejer7b {
    public static void main(String[] args) {

        /*
         * Programa que lee una frase desde el teclado y nos alerta de si contiene
         * alguna palabra malsonante.
         * Las palabras malsonantes las buscará en un array llamado palabrotas.
         * using indexOf() method
         * Sustituyendo las palabrotas por asteriscos
         */

        Scanner escaner = new Scanner(System.in);

        String[] palabrotas = { "puto", "mierda", "coño", "polla", "gilipollas", "cabron", "cabrona", "joder", "jodete",
                "jodida", "jodido", "jodidos" };
        int i;
        String frase;
        boolean contienePalabrota = false;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();
        escaner.close();

        for (i = 0; i < palabrotas.length; i++) {

            if (frase.indexOf(palabrotas[i]) != -1) {
                contienePalabrota = true;
                frase = frase.replace(palabrotas[i], "*****");
            }
        }
        System.out.println(frase);
    }
}
