package Actividades.Hoja2;

public class Ejer13 {

    public static void main(String[] args) {

        /*
         * La tabla siguiente muestra tres magnitudes meteorológicas medidas en cuatro
         * momentos del día. Guarda estos datos en un array bidimensional llamado medidas.
         */

        // Declaramos el array bidimensional
        double[][] medidas = { { 10.0, 12.0, 14.0, 15.0 }, { 20.0, 22.0, 24.0, 25.0 }, { 30.0, 32.0, 34.0, 35.0 } };

        // Mostramos el array bidimensional
        System.out.println("Array bidimensional: ");

        for (int i = 0; i < medidas.length; i++) {

            for (int j = 0; j < medidas[i].length; j++) {

                System.out.print(medidas[i][j] + " ");
            }

            System.out.println();
        }

        // Declaramos variables
        double max = 0;
        double min = 0;
        double media = 0;
        double suma = 0;

        // Calculamos el valor máximo, mínimo y la media
        for (int i = 0; i < medidas.length; i++) {

            for (int j = 0; j < medidas[i].length; j++) {

                // Comprobamos si estamos en la primera posición
                if (i == 0 && j == 0) {

                    max = medidas[i][j];
                    min = medidas[i][j];
                }

                // Comprobamos si el valor actual es mayor que el valor máximo
                if (medidas[i][j] > max) {

                    max = medidas[i][j];
                }

                // Comprobamos si el valor actual es menor que el valor mínimo
                if (medidas[i][j] < min) {

                    min = medidas[i][j];
                }

                suma += medidas[i][j];
            }
        }

        // Calculamos la media
        media = suma / (medidas.length * medidas[0].length);

        // Mostramos los resultados
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("La media es: " + media);

    }

}
