package actividades.Bucles;

import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        /*
         * Crea un programa que lea una palabra del usuario y la escriba cinco veces en
         * la pantalla. A continuación volverá a pedir una palabra al usuario y
         * mostrarla cinco veces. Y así mientras el usuario no escriba la palabra
         * "STOP".
         */

        Scanner escaner = new Scanner(System.in);

        String palabra = "manu";

        while (!palabra.equals("STOP")) {
            System.out.println("Escribe una palabra");
            palabra = escaner.nextLine();

            if (!palabra.equals("STOP")) {

                for (int j = 1; j < 5; j++) {
                    System.out.println(palabra);
                }

            } else {
                System.out.println("Programa detenido");
                System.exit(0);
            }
        }

        escaner.close();

    }

}
