package Actividades;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        /*
         * Crea un programa que lea los precios de hasta cien productos y los guarde en
         * un array llamado compra. Mientras los precios se van pidiendo al usuario, 
         * si éste introduce el valor 0, el programa entenderá que se ha terminado la compra, 
         * y mostrará todos los precios introducidos hasta el momento (no las posiciones vacías).
         */

        Scanner escaner = new Scanner(System.in);

        double [] compra = new double [100];

        for (int i = 0; i<compra.length; i++) {
            System.out.println("Introduce el precio del producto");
            compra [i] = escaner.nextDouble();

            if (compra[i]==0) {
                System.exit(i);
            }
        }
        escaner.close();
    }
}
