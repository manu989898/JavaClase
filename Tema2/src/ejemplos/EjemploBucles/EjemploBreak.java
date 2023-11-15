package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploBreak {
    public static void main(String[] args) {
        /*
         * Programa que pide 10 nombres.
         * Si uno de los nombres es "parar" el bucle terminará en ese momento.
         */

        Scanner escaner = new Scanner(System.in);

        String nombre;

        for (int i = 0; i <= 10; i++) {

            System.out.println("Introduce un nombre: ");
            nombre = escaner.nextLine();

            if (nombre.equals("parar")) {
                System.out.println("Has introducido parar, el programa terminará.");
                //La instrucción break hace que el bucle termine en ese momento.
                break;
            }

            System.out.println("Has introducido: " + nombre);

        }

        escaner.close();
    }
}
