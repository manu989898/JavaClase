package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /*
         * Modifica el programa anterior para que acepte una nota con decimales
         * (por ejemplo, si la nota es menor que 5, la calificación será de
         * Insuficiente).
         */

        double nota;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa la nota entre 0 y 10");
        nota = escaner.nextDouble();

        if (nota < 5) {
            System.out.println("INSUFICIENTE!");
        } else if (nota == 5) {
            System.out.println("SUFICIENTE!");

        } else if (nota == 6) {
            System.out.println("BIEN!");

        } else if (nota == 7 || nota == 8) {

            System.out.println("NOTABLE");
        } else if (nota == 9 || nota == 10) {

            System.out.println("EXCELENTE!");

        }

        escaner.close();
    }

}
