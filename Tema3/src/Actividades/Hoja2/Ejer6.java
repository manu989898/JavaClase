package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {

        /*
         * Escribe una aplicación que vaya preguntando los votos de seis partidos
         * políticos en unas
         * elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor
         * número de votos y cuál
         * el mayor, así como las posiciones del array que ocupan estos partidos.
         */
        Scanner escaner = new Scanner(System.in);

        // Creación de variables y arrays
        String[] partidos = { "PP", "PSOE", "VOX", "UP", "ERC", "CarlosElMejorProfe" };
        int[] votos = new int[6];
        
        System.out.println("Introduce los votos de los 6 partidos políticos: ");

        // for para recorrer el array
        for (int i = 0; i < votos.length; i++) {

            // Se piden los votos de cada partido y se muestra su nombre en la pregunta
            System.out.println("Introduce los votos del partido " + partidos[i] + ": ");
            votos[i] = escaner.nextInt();
        }

        int max = votos[0];
        int min = votos[0];
        int posMax = 0;
        int posMin = 0;

        // for para recorrer el array
        for (int i = 0; i < votos.length; i++) {

            /*
             * Si los votos del partido actual son mayores que los votos máximos,
             * los votos máximos pasan a ser los votos del partido actual
             */
            if (votos[i] > max) {
                System.out.println("max = " + max);
                max = votos[i];
                posMax = i;
            }

            /*
             * Si los votos del partido actual son menores que los votos mínimos,
             * los votos mínimos pasan a ser los votos del partido actual
             */
            if (votos[i] < min) {
                System.out.println(min);
                min = votos[i];
                posMin = i;
            }
        }

        System.out.println("El partido con más votos obtenidos ha sido: " + partidos[posMax] + " Con " + votos[posMax]
                + " votos, en la posición " + posMax);
        System.out.println("El partido con menos votos obtenidos ha sido: " + partidos[posMin] + " Con " + votos[posMin]
                + " votos, en la posición " + posMin);
        escaner.close();
    }
}
