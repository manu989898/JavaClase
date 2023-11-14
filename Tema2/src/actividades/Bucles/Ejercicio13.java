package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        /*
         * Escribe un programa que pregunte un número entre 1 y 20. Si el número
         * introducido no cumple
         * la condición, se le volverá a preguntar hasta que la cumpla. Al final
         * simplemente se mostrará el
         * número en pantalla.
         */

        Scanner escaner = new Scanner(System.in);

        int num1;

        do {

            System.out.println("escribe un número del 1 al 20");
            num1 = escaner.nextInt();

        } while (num1 < 1 || num1 > 20);

        System.out.println("El número es: " + num1);

        escaner.close();

    }

}
