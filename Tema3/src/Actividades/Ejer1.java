package Actividades;

public class Ejer1 {
    public static void main(String[] args) {
        /*
         * Crea un array de Strings llamado estaciones cuyos valores sean los nombres de
         * las cuatro
         * estaciones del año. Haz que después se muestren todos los valores mediante un
         * bucle for.
         */

        // Creamos el array de Strings
        String[] estaciones = { "Primavera", "Verano", "Otoño", "Invierno" };

        // Recorremos el array con un bucle for
        for (int i = 0; i < estaciones.length; i++) {
            System.out.println("Posicion " + i + " = " + estaciones[i]);
        }
    }
}
