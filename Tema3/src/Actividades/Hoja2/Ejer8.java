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

        // Declaramos las variables
        int humedadMax = humedad[0];
        int humedadMin = humedad[0];
        int horaMax = 0;
        int horaMin = 0;

        // Recorremos el array
        for (int i = 0; i < humedad.length; i++) {
            // Comprobamos si la humedad es mayor que la humedadMax
            if (humedad[i] > humedadMax) {
                // Si es mayor, guardamos la humedad y la hora
                humedadMax = humedad[i];
                horaMax = i;
            }
            // Comprobamos si la humedad es menor que la humedadMin
            if (humedad[i] < humedadMin) {
                // Si es menor, guardamos la humedad y la hora
                humedadMin = humedad[i];
                horaMin = i;
            }
        }

        // Mostramos los resultados
        System.out.println("La humedad máxima ha sido de " + humedadMax + "% a las " + horaMax + " horas.");
        System.out.println("La humedad mínima ha sido de " + humedadMin + "% a las " + horaMin + " horas.");

        // Mostramos el array
        System.out.println(Arrays.toString(humedad));

        

    }
}
