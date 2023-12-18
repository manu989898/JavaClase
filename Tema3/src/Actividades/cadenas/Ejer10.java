package Actividades.cadenas;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        /*
         * Programa que lee una frase y nos dice por cuántas palabras está formada. Usa
         * el método indexOf(int caracter, int posicion).
         */

        Scanner escaner = new Scanner(System.in);
        String frase;
        int contador = 0;

        System.out.println("ingresa una frase");
        frase = escaner.nextLine();

        // recorremos la frase buscando espacios en blanco
        for (int i = 0; i < frase.length(); i++) {

            // si encontramos un espacio en blanco incrementamos el contador
            if (frase.indexOf(" ", i) == i) {
                contador++;
            }
        }

        // mostramos el número de palabras
        System.out.println("La frase está formada por " + (contador + 1) + " palabras");

        escaner.close();
    }
}
