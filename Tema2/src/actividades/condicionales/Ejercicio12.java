package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*
         * Diseña un programa que pida una nota entera entre 0 y 10 y
         * la convierta a la calificación correspondiente (Insuficiente, Suficiente,
         * Bien, Notable y Sobresaliente).
         */

        int nota;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa la nota entre 0 y 10");
        nota = escaner.nextInt();

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
