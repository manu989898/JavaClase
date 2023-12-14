package Actividades.cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
    public static void main(String[] args) {

        /*
         * Programa que te pide cinco palabras, las guarda en un array, y ordena el
         * array alfabéticamente.
         */

        Scanner escaner = new Scanner(System.in);
        String aux = "";
        int posMin;
        String[] palabras = new String[5];
        
        // pedimos las palabras y las guardamos en el array
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra " + (i + 1) + " :");
            palabras[i] = escaner.nextLine();
        }

        // recorremos el array desde la posición 1 hasta el final
        for (int i = 0; i < palabras.length-1; i++) {
            
            // asignamos a posMin la posicion del indice que etsamos recorriendo
            posMin=i;

            for (int j = i + 1; j < palabras.length; j++) {

                // si palabras[j] es menor que la que tenemos en posMin la sustituimos
                if (palabras[j].compareTo(palabras[posMin]) < 0) {

                    posMin=j;
                }
            }

            // intercambiamos los valores en el array
            aux = palabras[i];
            palabras[i] = palabras[posMin];
            palabras[posMin] = aux;
        }

        // mostramos la palabra menor usando Arrays.toString()
        System.out.println(Arrays.toString(palabras));
        escaner.close();
    }
}
