package Actividades.Hoja2;

import java.util.Arrays;

public class Ejer8 {
    public static void main(String[] args) {

        /*
         * La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a
         * lo largo de las 24
         * horas de un día. Crea un programa capaz de recorrer este array e indicar
         * cuáles han sido las
         * humedades máxima y mínima del día, y a qué horas se han producido.
         */

        // Declaramos el array
        int[] humedad = { 70, 65, 63, 60, 58, 55, 53, 52, 50, 52, 55, 58, 60, 63, 65, 68, 70, 72, 75, 78, 80, 83, 85,
                88 };

        // Inicializamos variables
        int aux = 0;
        int posMin = 0;
        int min = 0;
        int max = 0;

        // Mostramos el array desordenado
        System.out.println("\nArray desordenado: ");
        System.out.println(Arrays.toString(humedad));

        // Recorremos el array menos la posicion final
        for (int i = 0; i < humedad.length - 1; i++) {

            // Asignamos el valor de la posicion actual a la variable min
            posMin = i;

            // Recorremos el array desde la posicion actual + 1
            for (int j = i + 1; j < humedad.length; j++) {

                // Comprobamos si el valor de la posicion actual es mayor que el valor de la
                // posicion j
                if (humedad[posMin] > humedad[j]) {

                    // Asignamos el valor de la posicion j a la variable min
                    posMin = j;
                }
            }
            // Intercambiamos los valores
            aux = humedad[i];
            humedad[i] = humedad[posMin];
            humedad[posMin] = aux;
        }

        // Mostramos el array ordenado
        System.out.println("\nArray ordenado: ");
        System.out.println(Arrays.toString(humedad));

        // Mostramos la humedad minima
        System.out.println("\nLa humedad minima es: " + humedad[0] + "%");

        // Mostramos la humedad maxima
        System.out.println("\nLa humedad maxima es: " + humedad[humedad.length - 1] + "%");

        // Recorremos el array para mostrar las horas en las que se ha producido la
        // humedad minima
        System.out.println("\nLa humedad minima se ha producido a las: ");
        for (int i = 0; i < humedad.length; i++) {
            if (humedad[i] == humedad[0]) {
                System.out.print(i + "h ");
            }
        }

        // Recorremos el array para mostrar las horas en las que se ha producido la
        // humedad maxima
        System.out.println("\nLa humedad maxima se ha producido a las: ");
        for (int i = 0; i < humedad.length; i++) {
            if (humedad[i] == humedad[humedad.length - 1]) {
                System.out.print(i + "h ");
            }
        }

    }
}
