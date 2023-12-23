package Practica;

public class Ejer2 {
    public static void main(String[] args) {
        /*
         * La siguiente tabla muestra algunas de las variedades que existen de
         * naranja, y la producción aproximada de un árbol de cada variedad:
         * Variedad Kg
         * producidos
         * Navel Lane Late 8.5
         * Navelina 4
         * Washington Navel 6.7
         * Thomson 4.9
         * Newhall 10.1
         * Navelate 6.3
         * Ricalate 5.5
         * Escribe un programa que almacene estos datos en un array llamado produccion.
         * Después:
         * • Mostrará la tabla de forma que las columnas no queden descolocadas.
         * • Calculará el promedio de kg producidos.
         * • Calculará la variedad que más produce, y la que menos.
         * 
         */

        int posMin = 0;
        double pesoTotal = 0;
        String[] aux;
        String[][] produccion = {
                { "Navel Lane Late",    "8.5"    },
                { "Navelina",           "4"      },
                { "Washington Navel",   "6.7"    },
                { "Thomson ",           "4.9"    },
                { "Newhall ",           "10.1"   },
                { "Navelate ",          "6.3"    },
                { "Ricalate  ",         "5.5"    }, };

        // Syso de la tabla dando un foromato máximo de 20 caracteres para los nombres y
        // de 4 para elk peso
        System.out.printf("%-20s %4s \n", "Variedad", "Peso");
        System.out.printf("%-20s %4s \n", "====================", "====");

        // For para mostrar los datos de la tabla
        for (int fila = 0; fila < produccion.length; fila++) {

            System.out.printf("%-20s %-4s \n", produccion[fila][0], produccion[fila][1]);
        }

        // For para sumar todos los kg producidos y luego usarlos para la media
        for (int i = 0; i < produccion.length; i++) {

            // Asigno a pesoTotal el valor de pesoTotal + el valor de la posición i del array
            pesoTotal = pesoTotal + Double.parseDouble(produccion[i][1]);
        }

        // Buscle para ordenar el array por peso
        for (int i = 0; i < produccion.length - 1; i++) {
            posMin = i;

            for (int j = i + 1; j < produccion.length; j++) {

                if (Double.parseDouble(produccion[j][1]) < Double.parseDouble(produccion[posMin][1])) {
                    posMin = j;
                }
            }

            // Intercambio de valores uando aux para no perder el valor de la posición i
            aux = produccion[i];
            produccion[i] = produccion[posMin];
            produccion[posMin] = aux;

        }
        System.out.println("\nAnálisis de producción: ");

        // Mostrando el peso máximo (al estar ordenaod el array, se encuentra en la
        // última posición)
        System.out.println("\n  * Variedad que produce más: " + produccion[produccion.length - 1][0] + " " + "("
                + produccion[produccion.length - 1][1] + " kg).");

        // Mostrando el peso mínimo (al estar ordenaod el array, se encuentra en la
        // primera posición)
        System.out.println(
                "  * Variedad que produce menos: " + produccion[0][0] + " " + "(" + produccion[0][1] + " kg).");

        // Mostrando promedio con solo dos decimales
        System.out.println("  * Promedio producido por un naranjo: "
                + Math.round((pesoTotal / produccion.length) * 100) / 100.0 + " kg.");
    }
}
