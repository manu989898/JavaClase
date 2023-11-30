package Actividades.Hoja3;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * A lo largo de diez días los valores de las acciones de Microsoft al cierre
         * del mercado han sido:
         * 47'5 47'8 48 48'1 47'7 47'3 46 47'9 48'05 48'7
         * 
         * Diseña un programa que calcule el mínimo y el máximo de los valores
         * mencionados. Utiliza un
         * array de nombre cotizaciones. Introduce los datos directamente en el código
         * del programa.
         */

        double[] cotizaciones = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

        double max = cotizaciones[0];
        double min = cotizaciones[0];
        int posMax = 0;
        int posMin = 0;
      

        for (int i = 0; i < cotizaciones.length; i++) {

            //Si la temperatura es mayor que la máxima, la temperatura máxima pasa a ser la temperatura actual
            if (cotizaciones[i] > max) {

                max = cotizaciones[i];
                posMax = i;
            }
            
            //Si la temperatura es menor que la mínima, la temperatura mínima pasa a ser la temperatura actual
            if (cotizaciones[i] < min) {

                min = cotizaciones[i];
                posMin = i;
            }
        }
        System.out.println("El dia "+ posMin + " con el valor mínimo de cierre fue de: " + cotizaciones[posMin]);
        System.out.println("El dia "+ posMax + " con el valor mínimo de cierre fue de: " + cotizaciones[posMax]);
    }
}
