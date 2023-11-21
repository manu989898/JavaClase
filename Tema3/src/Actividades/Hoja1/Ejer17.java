package Actividades.Hoja1;

import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {

        /*
         * Escribe una aplicación que pida al usuario diez precios de productos. Después
         * devolverá el precio total a pagar y el número de productos cuyo precio sea mayor de 10
         * euros.
         */

        Scanner escaner = new Scanner(System.in);

        int mayor=0;
        double[] precios = new double[10];
        double total = 0;
        
        //Bucle for apra recorrer y asignar los valores del array precios.
        for (int i = 0; i < precios.length; i++) {

            System.out.println("Ingrese el precio del producto " + i + ":");
            precios[i] = escaner.nextDouble();
            
            //Sumamos a la variable total el valor del indice i.
            total = total + precios[i];

            //Condicion para que si el precio en el indice i es <10 se sume 1 a la variable mayor
            if (precios[i] > 10 ) {

                mayor++;
            }

        }
        //Imprimimos el total de la compra y  la cantidad de productos superiroes a 10 euros.
        System.out.println("\nEl precio total de la compra es de: " + total);
        System.out.println("\nLa cantidad de productos superiores a 10 eurso es de: " + mayor);
        escaner.close();
    }
}
