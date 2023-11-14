package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {

        /*
         * Programa que pregunta al usuario una temperatura:
         * Si el usuario no escribe un numero, el programa le informara de su torpeza.
         * Si el valor de la temperatura es inferior a 15ºC, el programa le informara de
         * que hace frio.
         * Si el valor esta entre 15ºC (inclusive) y 25ºC (no inclusive), el programa le
         * informara de que hace una temperatura agradable.
         * Si el valor es igual o superior a 25ºC, el programa le informara de que hace
         * calor.
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce la temperatura");

        if (escaner.hasNextFloat()) {

            float temp = escaner.nextFloat();

            if (temp < 15) {

                System.out.println("Hace frio!");

            } else if ((temp >= 15) && (temp < 25)) {

                System.out.println("Hace una temperatura agradable!");

            } else if (temp >= 25) {

                System.out.println("Hace calor!");

            }

        } else {

            System.out.println("Vaya torpe! El valor introducido no es un numero");

        }

        escaner.close();
    }
}
