package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {

        /*
         * Escribe un programa que guarde las siguientes temperaturas en un array y
         * busque su máximo y mínimo. Además deberá indicar en qué posición del array 
         * están ese máximo y mínimo.
         * 15 ºC 16'1 ºC 16 ºC 15'4 ºC 15 ºC 14 ºC 10'2 ºC
         * 11 ºC 11'5 ºC 10 ºC 10'1 ºC 9'8 ºC 9 ºC 6 ºC
         */

        Scanner escaner = new Scanner(System.in);
      
        //Inicialización del array y declaración de variables
        double[] temps = {16,16.1,16,15.4,15,14,10.2,11,11.5,10,10.1,9.8,9,6};
        double max = temps[0];
        double min = temps[0];
        int posMax = 0;
        int posMin = 0;

        //for para recorrer el array
        for (int i = 0; i < temps.length; i++) {

            //Si la temperatura es mayor que la máxima, la temperatura máxima pasa a ser la temperatura actual
            if (temps[i] > max) {

                max = temps[i];
                posMax = i;
            }
            
            //Si la temperatura es menor que la mínima, la temperatura mínima pasa a ser la temperatura actual
            if (temps[i] < min) {

                min = temps[i];
                posMin = i;
            }
        }

        System.out.println("La temperatura máxima es: " + max + "ºC, en la posición " + posMax);
        System.out.println("La temperatura mínima es: " + min + "ºC, en la posición " + posMin);
        escaner.close();
    }
}
