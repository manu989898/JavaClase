package Actividades;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {

        /*
         * Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las
         * diez notas desde la consola, mediante un bucle while, y guardándolas en el
         * array. A continuación,
         * muestra las diez notas.
         */

        Scanner escaner = new Scanner(System.in);

        double[] notas = new double[10];
        int i = 0;
        while (i < notas.length) {

            System.out.println("Ingresa la nota");
            notas[i] = escaner.nextDouble();
            i++;
        }

        escaner.close();

        System.out.println("El tamaño de la lista es de : " + notas.length);
        for (i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
    }
}
