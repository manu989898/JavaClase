package Actividades;

public class Ejer15 {
    public static void main(String[] args) {

        /*
         * Crea un programa que declare un array con las siguientes temperaturas de las
         * últimas dos
         * semanas y devuelva la temperatura media:
         * 
         * 15 oC 16'1 oC 16 oC 15'4 oC 15 oC 14 oC 10'2 oC
         * 11 oC 11'5 oC 10 oC 10'1 oC 9'8 oC 9 oC 6 oC
         */


        // Declaración de variables
        double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
        double media = 0;

        // Cálculo de la media
        for (int i = 0; i < temperaturas.length; i++) {
            media += temperaturas[i];
        }

        media /= temperaturas.length;

        // Mostramos la media
        System.out.println("La temperatura media de las últimas dos semanas es de " + media + " grados.");
        
    }
}
