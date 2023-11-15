package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {

        /*
         * Programa que pida dos números enteros y que nos devuelva la suma.
         */

        Scanner escaner = new Scanner(System.in);

        int primer;
        int segun;

        System.out.println("Introduce el primer valor a sumar");

        if (escaner.hasNextInt()) {

            primer = escaner.nextInt();
            System.out.println("Introduce el segundo valor a sumar");

            if (escaner.hasNextInt()) {

                segun = escaner.nextInt();
                System.out.println("La suma de: " + primer + " + " + segun + " =5 " + (primer + segun));

            } else {
                System.out.println("El valor introducido no es correcto");
                System.exit(0);
            }

        } else {
            System.out.println("El valor introducido no es correcto");
            System.exit(0);
        }

        escaner.close();

    }
}
