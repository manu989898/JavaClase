package Actividades;

public class Ejer3 {
    public static void main(String[] args) {
        /*
         * Crea un array llamado densidades con las densidades (en g/cm3) de los nueve
         * (sí, nueve)
         * planetas del Sistema Solar. Haz que después se muestren todos los valores
         * mediante un bucle for.
         */

        // Creamos el array de Strings
        float[] densidades = { 5.43f, 5.25f, 5.52f, 3.93f, 1.33f, 0.69f, 1.27f, 0.69f, 1.64f };

        for (int i = 0; i < densidades.length; i++) {
            System.out.println("Posicion " + i + " = " + densidades[i]);
        }
    }
}
