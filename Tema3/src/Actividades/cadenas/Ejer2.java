package Actividades.cadenas;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * Programa que lea una contraseña y valide si cumple con una longitud mínima de
         * 6 y máxima de 12.
         */
        Scanner escaner = new Scanner(System.in);
        int longitud;

        System.out.println("Introduce una contraseña: ");
        String contrasenia = escaner.nextLine();
        longitud = contrasenia.length();
        
        if (longitud > 6 && longitud < 12) {

            System.out.println("La contraseña es correcta.");

        } else {

            System.out.println("La contraseña no es correcta.");
        }

        escaner.close();
    }
}
