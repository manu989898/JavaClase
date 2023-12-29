package Practica2;

public class Ejer2 {
    public static void main(String[] args) {
        /*
         * Actividad 2
         * La siguiente tabla muestra algunas de las variedades que existen de naranja,
         * y la producción aproximada de un árbol de cada variedad:
         * Variedad
         * Kg producidos
         * Navel Lane Late
         * 8.5
         * Navelina
         * 4
         * Washington Navel
         * 6.7
         * Thomson
         * 4.9
         * Newhall
         * 10.1
         * Navelate
         * 6.3
         * Ricalate
         * 5.5
         * Escribe un programa que almacene estos datos en un array llamado produccion.
         * Después procederá a ordenar la tabla de menor a mayor (según el campo kg).
         */
        String[] aux;
        int posMin = 0;
        String[][] produccion = { { "Navel Lane Late", "8.5" }, { "Navelina", "4" }, { "Washington Navel", "6.7" },
                { "Thomson", "4.9" }, { "Newhall", "10.1" }, { "Navelate", "6.3" }, { "Ricalate", "5.5" } };

        // Ordenación por selección
        for (int i = 0; i < produccion.length - 1; i++) {
            posMin = i;
            // Recorre el array desde la posición i + 1 hasta el final
            for (int j = i + 1; j < produccion.length; j++) {

                // Compara el valor de la posición j con el de la posición posMin y si es menor lo guarda en posMin
                if (Double.parseDouble(produccion[j][1]) < Double.parseDouble(produccion[posMin][1])) {
                    posMin = j;
                }
            }

            // Intercambio de valores uando aux para no perder el valor de la posición i
            aux = produccion[i];
            produccion[i] = produccion[posMin];
            produccion[posMin] = aux;

        }
        // Mostrar la tabla ordenada
        System.out.println("\nInformación sobre la producción de naranjas, en kg, de menor a mayor:");
        System.out.println();
        System.out.printf("%-20s %-4s \n", "Variedad", "Kg");
        System.out.println("==================== =====");

        for (int k = 0; k < produccion.length; k++) {
            System.out.printf("%-20s %-4s", produccion[k][0], produccion[k][1]);
            System.out.println();
        }
    }
}
