package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        /*
         *Crea un programa que solicite al usuario los precios de cuatro objetos y devuelva el precio total.
         */

        Scanner escaner = new Scanner(System.in);
        
        float total = 0;

        for (int i=0; i <4 ; i++) {

        System.out.println("Ingresa el precio del producto:");
        
        float precios = escaner.nextFloat();

        total = total + precios;

        }

        System.out.println("El precio total es de: " + total + "$");

        escaner.close();
    }
}
