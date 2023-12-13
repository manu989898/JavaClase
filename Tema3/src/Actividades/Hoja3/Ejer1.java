package Actividades.Hoja3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        /*
         * En una biblioteca pública necesitan un programa para ir rellenando las fichas
         * de los libros. Los
         * datos a guardar de cada libro son: ISBN, título, autor y editorial.
         * Crea un programa que pida por consola 5 registros con los datos anteriores y
         * los guarde en un array
         * llamado libros. Después de introducidos, deberá listar en pantalla los datos
         * con el formato:
         * ISBN Título Autor Editorial
         * 
         */

        Scanner escaner = new Scanner(System.in);

        String[][] libros = new String[5][4];

        for (int i = 0; i < libros.length; i++) {

            System.out.println("Libro" + i + ":");

            System.out.println("Introduce el ISBN:");
            libros[i][0] = escaner.nextLine();

            System.out.println("Introduce el título:");
            libros[i][1] = escaner.nextLine();

            System.out.println("Introduce el autor:");
            libros[i][2] = escaner.nextLine();

            System.out.println("Introduce el editorial:");
            libros[i][3] = escaner.nextLine();
        }
        escaner.close();

        for (int i = 0; i < libros.length; i++) {

            System.out.println("libro" + (i + 1));
            System.out.println(Arrays.toString(libros[i]));
        }
    }
}
