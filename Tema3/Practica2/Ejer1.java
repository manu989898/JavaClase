package Practica2;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        /*
         * Actividad 1
         * Escribe una aplicación que solicite los nombres y edades de los pacientes de
         * una consulta médica.
         * El programa irá solicitando los datos hasta llegar a los diez pacientes o
         * hasta que el usuario pulse Intro cuando se le pida el nombre del siguiente
         * paciente. Los datos se guardarán en un array bidimensional llamado
         * pacientes.
         * Una vez leídos los datos, se mostrarán en forma de tabla. En esta tabla la
         * columna de nombres tendrá un ancho de 20 caracteres.
         * Por último, el programa nos informará de cuántos pacientes hay, su edad
         * media (con dos decimales) y cuántos jubilados (mayores de 65 años) hay.
         */
        Scanner teclado = new Scanner(System.in);
        int jubilados = 0;
        int contador = 0;
        int total = 0;
        String[][] pacientes = new String[10][10];

        // Bucle para recorrer el array
        for (int i = 0; i < pacientes.length; i++) {

            System.out.println("Nombre (máximo 20 caracteres) :");
            pacientes[i][0] = teclado.nextLine();
            
            // Si el nombre es vacio (pulsar ENTER), salimos del bucle
            if (pacientes[i][0].equals("")) {
                break;
            }
            System.out.println("Edad: ");
            pacientes[i][1] = teclado.nextLine();
            total = total + Integer.parseInt(pacientes[i][1]);
            contador++;

        }
        
        System.out.println("### LISTADO DE PACIENTES ###");
        System.out.println();
        System.out.printf("%-20s %-4s \n", "Nombre", "Edad");
        System.out.println("==================== =====");
        // Bucle para recorrer el array
        for (int i = 0; i < contador; i++) {
            // Si el nombre es vacio, salimos del bucle
            if (pacientes[i][0] == null) {
                break;
            // Si la edad es mayor de 65, incrementamos el contador de jubilados
            } else if (Integer.parseInt(pacientes[i][1]) > 65) {
                jubilados++;
            }

            System.out.printf("%-20s %-4s", pacientes[i][0], pacientes[i][1]);
            System.out.println();
        }
        System.out.println("\n### RESULTADO DEL ANALÍSIS ###");
        System.out.println("\nSe han introducido datos de " + contador + "  pacientes.");
        System.out.println("La media de edad es de: " + (total / contador) + " años.");
        System.out.println("Hay " + jubilados + " jubilados.");
        teclado.close();
    }
}
