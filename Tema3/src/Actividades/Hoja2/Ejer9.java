package Actividades.Hoja2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejer9 {

    public static void main(String[] args) {

        /*
         * Crea un programa que muestre los siguientes precios (guardados en un array
         * llamado precios)
         * ordenados de menor a mayor, usando el método de selección.
         * 43 58 44 62 80
         * 15 15 10 90 56
         */

        //Declaramos el array
        int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

        //Declaramos variables
        int aux = 0;
        int posMin = 0;

        //Mostramos el array desordenado
        System.out.println("Array desordenado: ");
        System.out.println(Arrays.toString(precios));

        //Recorremos el array menos la posicion final
        for (int i = 0; i < precios.length - 1; i++) {

            //Asignamos el valor de la posicion actual a la variable min
            posMin = i;

            //Recorremos el array desde la posicion actual + 1
            for (int j = i + 1; j < precios.length; j++) {

                //Comprobamos si el valor de la posicion actual es mayor que el valor de la posicion j
                if (precios[posMin] > precios[j]) {

                    //Asignamos el valor de la posicion j a la variable min
                    posMin = j;
                }
            }
            //Intercambiamos los valores
            aux = precios[i];
            precios[i] = precios[posMin];
            precios[posMin] = aux;
        }
        //Mostramos el array ordenado
        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(precios));

    }
}
