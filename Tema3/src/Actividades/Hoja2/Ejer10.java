package Actividades.Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {

        /*
         * Escribe un programa que pregunte las temperaturas de las últimas ocho horas y
         * las muestre
         * ordenadas de menor a mayor, usando el método de selección. Al final también
         * indicará la
         * temperatura menor y la mayor.
         */

        //Declaramos el array
        int[] temperaturas = new int[8];

        //Inicializamos variables
        int aux = 0;
        int posMin = 0;
      

        Scanner escaner = new Scanner(System.in);

        //Recorremos el array para introducir los valores por teclado
        for (int h = 0; h < temperaturas.length; h++) {
            System.out.println("Introduce la temperatura de la hora " + (h + 1) + ": ");
            temperaturas[h] = escaner.nextInt();
        }

        //Mostramos el array desordenado
        System.out.println("\nArray desordenado: ");
        System.out.println(Arrays.toString(temperaturas));

        //Recorremos el array menos la posicion final
        for (int i = 0; i < temperaturas.length - 1; i++) {

            //Asignamos el valor de la posicion actual a la variable min
            posMin = i;

            //Recorremos el array desde la posicion actual + 1
            for (int j = i + 1; j < temperaturas.length; j++) {

                //Comprobamos si el valor de la posicion actual es mayor que el valor de la posicion j
                if (temperaturas[posMin] > temperaturas[j]) {

                    //Asignamos el valor de la posicion j a la variable min
                    posMin = j;
                }
            }
            //Intercambiamos los valores
            aux = temperaturas[i];
            temperaturas[i] = temperaturas[posMin];
            temperaturas[posMin] = aux;
        }

        //Mostramos el array ordenado
        System.out.println("\nArray ordenado: ");
        System.out.println(Arrays.toString(temperaturas));

       
        //Mostramos el valor de la variable min
        System.out.println("\nLa temperatura minima es: " + temperaturas[0]);

        //Mostramos el valor de la variable max
        System.out.println("\nLa temperatura maxima es: " + temperaturas[temperaturas.length - 1]);

        escaner.close();

    }

}
