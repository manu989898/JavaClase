package Actividades;

public class Ejer4 {
    public static void main(String[] args) {
        /*
         * Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una
         * de ellas el
         * nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que
         * después se muestren
         * todos los valores mediante un bucle for.
         */

        // Creamos el array de Strings
        String[] companyeros = { "Javi", "Javi", "Javi", "Javi" };

        // Recorremos el array con un bucle for
        for (int i = 0; i < companyeros.length; i++) {
            System.out.println("Posicion " + i + " = " + companyeros[i]);
        }
    }
}
