package Actividades;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        /*
         * Modifica el programa anterior para que el programa pare de pedir notas si se
         * le pasa un valor negativo.
         */
        Scanner escaner = new Scanner(System.in);

        double[] notas = new double[10];
        int i = 0;
        
        while (i < 10) {

            System.out.println("Ingresa la nota");
            notas[i] = escaner.nextDouble();

            if (notas[i] <0){
                System.exit(i);
            }
            i++;
        }

        escaner.close();

        System.out.println("El tamaño de la lista es de : " + notas.length);
        for (i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
    }
}
