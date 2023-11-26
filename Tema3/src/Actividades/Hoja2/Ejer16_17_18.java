package Actividades.Hoja2;

public class Ejer16_17_18 {

    public static void main(String[] args) {

        /*
         * - La siguiente tabla guarda una serie de calificaciones de varios alumnos.
         * Guárdalas en un array,
         * muéstralas en pantalla y calcula la nota media del curso.
         * Alumno Nota
         * Jose Luis Martínez 7
         * Antonia Ruiz 9
         * Marcos Ramírez 10
         * Juana Herranz 4
         * Alberto López 7
         * 17.- Añade al ejercicio anterior un bucle donde se busque en el array quién
         * tiene la nota más baja.
         * La salida debería ser algo como:
         * "Juana Herranz tiene la nota más baja, un 4".
         * Añade al ejercicio anterior un bucle donde se busque en el array quién tiene
         * la nota más alta. La
         * salida debería ser algo como: "Marcos Ramírez tiene la nota más alta, un 10".
         */

        // Declaramos el array bidimensional
        String[][] calificaciones = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
                { "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };
        
        // Mostramos el array bidimensional
        System.out.println("Array bidimensional: ");

        for (int i = 0; i < calificaciones.length; i++) {

            for (int j = 0; j < calificaciones[i].length; j++) {

                System.out.print(calificaciones[i][j] + " ");
            }

            System.out.println();
        }
    
        // Declaramos variables
        float notaMedia = 0;
        float notaMasBaja = 10;
        float notaMasAlta = 0;
        String alumnoNotaMasBaja = "";
        String alumnoNotaMasAlta = "";

        // Calculamos la nota media
        for (int i = 0; i < calificaciones.length; i++) {

            // Sumamos la nota actual a la nota media
            // Convertimos la nota actual a float con el método Float.parseFloat()
            notaMedia += Float.parseFloat(calificaciones[i][1]);

            // Comprobamos si la nota actual es la más baja
            if (Float.parseFloat(calificaciones[i][1]) < notaMasBaja) {

                // Guardamos la nota actual como la más baja
                notaMasBaja = Float.parseFloat(calificaciones[i][1]);

                // Guardamos el nombre del alumno con la nota más baja
                alumnoNotaMasBaja = calificaciones[i][0];
            }

            // Comprobamos si la nota actual es la más alta
            if (Float.parseFloat(calificaciones[i][1]) > notaMasAlta) {

                // Guardamos la nota actual como la más alta
                notaMasAlta = Float.parseFloat(calificaciones[i][1]);

                // Guardamos el nombre del alumno con la nota más alta
                alumnoNotaMasAlta = calificaciones[i][0];
            }
        }
        
        // Calculamos la nota media
        notaMedia /= calificaciones.length;

        // Mostramos la nota media
        System.out.println("\nLa nota media es: " + notaMedia);

        // Mostramos la nota más baja
        System.out.println(alumnoNotaMasBaja + " tiene la nota más baja, un " + notaMasBaja);

        // Mostramos la nota más alta
        System.out.println(alumnoNotaMasAlta + " tiene la nota más alta, un " + notaMasAlta);


    }
}
