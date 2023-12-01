package Ejemplos;

public class OrdenArrayBidimensional {
    public static void main(String[] args) {
        
        /*
         * Ejemplo de ordenación de un array bidimensional nombres y sueldos
         */

        // Declaramos el array bidimensional

        String[][] nombresSueldos = { { "Pepe", "1900" }, { "Juan", "1700" }, { "Laura", "1600" }, {"Paula", "1800"} };

        // Mostramos el array sin ordenar
        System.out.println("Array sin ordenar: ");
        for (int i = 0; i < nombresSueldos.length; i++) {
            System.out.println(nombresSueldos[i][0] + " " + nombresSueldos[i][1]);
        }

        /* Ordenamos el array por sueldos
        for (int i = 0; i < nombresSueldos.length - 1; i++) {

            for (int j = i + 1; j < nombresSueldos.length; j++) {
                
                if (Integer.parseInt(nombresSueldos[i][1]) > Integer.parseInt(nombresSueldos[j][1])) {
                    String auxNombre = nombresSueldos[i][0];
                    String auxSueldo = nombresSueldos[i][1];
                    nombresSueldos[i][0] = nombresSueldos[j][0];
                    nombresSueldos[i][1] = nombresSueldos[j][1];
                    nombresSueldos[j][0] = auxNombre;
                    nombresSueldos[j][1] = auxSueldo;
                }
            }
        }
        */

        // Usando una variable aux
        for (int i = 0; i < nombresSueldos.length - 1; i++) {

            for (int j = i + 1; j < nombresSueldos.length; j++) {
                
                if (Integer.parseInt(nombresSueldos[i][1]) > Integer.parseInt(nombresSueldos[j][1])) {
                    String[] aux = nombresSueldos[i];
                    nombresSueldos[i] = nombresSueldos[j];
                    nombresSueldos[j] = aux;
                }
            }
        }
    }
}
