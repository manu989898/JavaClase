package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer15 {

    public static void main(String[] args) throws InterruptedException {
        
        /*
         * Desarrolla modularmente (usando tres métodos, además de main( )) un programa
         * que solicite por consola una lista de números enteros, los ordene y los
         * muestre en
         * pantalla.
         */
        int[] numeros = new int[3];

        System.out.println("Ejecutando método pedir...");
        Thread.sleep(2500);
        pedir(numeros);

        System.out.println("Ejecutando método ordenación...");
        Thread.sleep(2500);
        ordenacion(numeros);

        System.out.println("Ejecutando método mostrar...");
        Thread.sleep(2500);
        mostrar(numeros);
    }

    static int[] pedir(int[] numeros){

        Scanner escaner = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdice el número " + (i+1));
            numeros[i] = escaner.nextInt();
        }
        escaner.close();
        return numeros;
    }

    static int[] ordenacion(int[] numeros) {

        int posMin = 0;
        int aux = 0;

        for (int i = 0; i < numeros.length -1; i++) {
            posMin = i;
            
            for (int j = i + 1 ; j < numeros.length; j++) {

                if (numeros[j] < numeros[posMin]) {
                    posMin = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[posMin];
            numeros[posMin] = aux;
        }
        return numeros;
    }
    
    static void mostrar( int[] numeros) {

        System.out.println(Arrays.toString(ordenacion(numeros)));
    }
}
