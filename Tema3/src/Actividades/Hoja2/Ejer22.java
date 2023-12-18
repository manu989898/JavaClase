package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer22 {

    public static void main(String[] args) {

        /*
         * Escribe un programa que vaya preguntando y guardando en un array el nombre de
         * un alumno y
         * sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres
         * alumnos. A continuación
         * mostrará una lista con el nombre de cada alumno y su nota de evaluación, que
         * vendrá dada por la
         * fórmula:
         * N= 50⋅E+40⋅T+10⋅A
         * ----------------
         * 100
         *
         * -------------notas----------------
         * [0][0] [0][1] [0][2] [0][3]
         * [1][0] [1][1] [1][2] [1][3]
         * [2][0] [2][1] [2][2] [2][3]
         * ----------------------------------
         *
         */

        // Declaramos el array bidimensional
        // Array de 3 filas(una por cada alumno) y 4 columnas(nombre, ,examen, trabajo y actitud)
        String[][] notas = new String[3][4];

        // Declaramos el scanner
        Scanner escaner = new Scanner(System.in);

        /*
         * Muestro la estructura del array
         * System.out.println("\nEstructura del array: ");
         * System.out.println("[alumno1][nombre] [alumno1][examen] [alumno1][trabajo] ;
         * System.out.println("[alumno2][nombre] [alumno2][examen] [alumno2][trabajo] ;
         * System.out.println("[alumno3][nombre] [alumno3][examen] [alumno3][trabajo] ;
         */

        // Pedimos los datos de los alumnos
        for (int i = 0; i < notas.length; i++) {

            System.out.println("\nAlumno " + (i + 1) + ": ");

            // Añadimos +1 en el segundo indice para cambiar de columna y en este caso la
            // fila seria i
            System.out.print("Nombre: ");
            notas[i][0] = escaner.nextLine();

            System.out.print("Nota examen: ");
            notas[i][1] = escaner.nextLine();

            System.out.print("Nota trabajo: ");
            notas[i][2] = escaner.nextLine();

            System.out.print("Nota actitud: ");
            notas[i][3] = escaner.nextLine();

        }

        // Mostramos los datos de los alumnos
        System.out.println("\nAlumnos: ");

        for (int i = 0; i < notas.length; i++) {
            // Añadimos +1 en el segundo indice para cambiar de columna y en este caso la
            // fila seria i
            System.out.println("Nombre: " + notas[i][0]);

            System.out.println("Nota examen: " + notas[i][1]);

            System.out.println("Nota trabajo: " + notas[i][2]);

            System.out.println("Nota actitud: " + notas[i][3]);
        }
        System.out.println("Nota de evaluación");
        System.out.println("==================");
        // Mostramos la nota de evaluacion de los alumnos
        for (int i = 0; i < notas.length; i++) {
            // i seria el alumno, 0 la columna de nombre y 1, 2 y 3 las columnas de examen,
            // trabajo y actitud
            System.out.println(notas[i][0] + ": " + ((50 * Float.parseFloat(notas[i][1])
                    + 40 * Float.parseFloat(notas[i][2])
                    + 10 * Float.parseFloat(notas[i][3])) / 100));
        }
        // Cerramos el scanner
        escaner.close();
    }
}