package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        /*
         * Crea un programa que guarde la siguiente tabla de edades en forma de array. A
         * continuación
         * deberá buscar si hay alguna persona con 35 años. Si la hay, se mostrará el
         * mensaje "Localizada
         * persona de 35 años". Utiliza una variable semáforo llamada edadEncontrada.
         * 20 25 30 28 39 42 30
         * 29 28 21 60 55 20 19
         */

        Scanner escaner = new Scanner(System.in);

        int[] edades = {20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
        boolean edadEncontrada=false;
        int buscada;

        System.out.println("Introduce la edad a buscar");
        buscada = escaner.nextInt();

        for (int i = 0; i < edades.length; i++) {

            if (edades[i] == buscada) {

                edadEncontrada = true;
            }
        }

        if (edadEncontrada) {

            System.out.println("Localizada");
        } else {

            System.out.println("No localizada");
        }
        escaner.close();
    }
}
