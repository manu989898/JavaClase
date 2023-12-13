package Actividades.cadenas;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {

        /*
         * Programa que lee una frase desde el teclado y nos alerta de si contiene
         * alguna palabra malsonante.
         * Las palabras malsonantes las buscará en un array llamado palabrotas.
         * using indexOf() method
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
                break;
            }
        }

        if (contienePalabrota) {
            System.out.println("La frase contiene palabrotas.");
        } else {
            System.out.println("La frase no contiene ninguna palabrota.");
        }
    }
}
