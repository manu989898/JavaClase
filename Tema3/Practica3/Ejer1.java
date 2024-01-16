package Practica3;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        /*
         * Escribe un programa que te pregunte una palabra y te diga si es capicúa o no.
         * Recuerda que una
         * palabra es capicua cuando se lee igual de izquierda a derecha que al revés.
         * Usa un método llamado esCapicua() que reciba una cadena y devuelva true si es capicua o false si
no.
         */

        Scanner escaner = new Scanner(System.in);

        System.out.print("Introduce una palabra y te diré si es capycúa: ");
        String palabra = escaner.nextLine();

        String palabraReves="";

        for (int i = palabra.length()-1; i >= 0; i--) {
            palabraReves += palabra.charAt(i);
        }

        if (palabra.equals(palabraReves)) {
            System.out.println("La palabra " + palabra +  " es capicua");
        } else {
            System.out.println("La palabra no es capicua");
        }

        escaner.close();

    }

    static boolean esCapicua(String palabra) {
        String palabraReves = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraReves += palabra.charAt(i);
        }

        if (palabra.equals(palabraReves)) {
            return true;
        } else {
            return false;
        }
    }
}
