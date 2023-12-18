package Actividades.Hoja3;

import java.util.Arrays;

public class Ejer3 {
    public static void main(String[] args) {

        /*
         * Crea un programa que tome los mismos datos que el anterior y los ordene de
         * menor a mayor (sin
         * calcular mínimo ni máximo).
         */
        double[] cotizaciones = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

        double aux = 0;
        int posMin = 0;

        for (int i = 0; i < cotizaciones.length; i++) {
            
            posMin = i;

            for (int j = i + 1; j < cotizaciones.length; j++) {
                
                if (cotizaciones[j] < cotizaciones[posMin]){

                    posMin = j;
                }
            }
            aux = cotizaciones[i];

            //Asignamos el valor de la posicion min a la posicion actual
            cotizaciones[i] = cotizaciones[posMin];
            
            //Asignamos el valor de la variable aux a la posicion min
            cotizaciones[posMin] = aux;
        }
        System.out.println(Arrays.toString(cotizaciones));
    }
}
