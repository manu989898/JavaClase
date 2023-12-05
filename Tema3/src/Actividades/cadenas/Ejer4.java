package Actividades.cadenas;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {

        /*
         * Programa que pide una frase y luego muestra la primera palabra
         */
        Scanner escaner = new Scanner(System.in);

        String frase;


        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();


        for (int i = 0; i < frase.length(); i++) {

            System.out.print(frase.charAt(i));
            if (frase.charAt(i) == ' ') {

                break;
            }
        }
        escaner.close();
    }
}
