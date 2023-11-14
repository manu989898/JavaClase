package Actividades;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * rea un array de Strings llamado meses cuyos valores sean los nombres de los
         * doce meses del
         * año. Haz que después se muestren todos los valores mediante un bucle while
         */

        // Creamos el array de Strings
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
                "Noviembre", "Diciembre" };
        
        // Creamos la variable para el bucle while
        int i = 0;
        
        // Recorremos el array con un bucle while
        while (i < meses.length) {
            System.out.println("Posicion " + i + " = " + meses[i]);
            i++;
        }

    }
}
