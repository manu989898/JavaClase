package Actividades;

import java.util.Arrays;

public class Ejer13 {
    public static void main(String[] args) {
        /*
         * Modifica la actividad anterior para que el método devuelva el array ordenado.
         */
        int[] edades = {2, 5, 2, 7, 4, 3};

        System.out.println("Array antes de ordenar: \n" + Arrays.toString(edades));

        System.out.println("Array despues de llamar al método: \n" + Arrays.toString(arrayOrdenado(edades)));
    }

    static int[] arrayOrdenado (int[] edades) {

        int posMin = 1;
        int aux = 0;


        for (int i = 0; i < edades.length -1; i++) {
            posMin = i;
            
            for (int j = i + 1 ; j < edades.length; j++) {

                if (edades[j] < edades[posMin]) {
                    posMin = j;
                }
            }

            aux = edades[i];
            edades[i] = edades[posMin];
            edades[posMin] = aux;
        }

        return edades;
    }
}
