package Practica;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        /*
         * Actividad 1
         * Crea una aplicación que permita al usuario analizar su consumo diario de
         * electricidad.
         * En primer lugar, le pedirá los consumos de los últimos seis días, en
         * Kilovatios hora.
         * Después, mostrará los consumos ordenados de menor a mayor y mostrará la
         * mediana
         * de los valores.
         * Observa que se te pide la mediana, no la media. La mediana se calcula
         * ordenando los valores de
         * menor a mayor y haciendo la media de los dos valores que quedan en medio.
         * Así, en el siguiente
         * ejemplo, la mediana se calcula haciendo la media de 3,5 y 4, y da 3,75. Haz
         * el cálculo usando la
         * propiedad length del array.
         */

        Scanner teclado = new Scanner(System.in);
        double[] consumo = new double[6];
        double aux;
        int posmin;
       

        System.out.println("Escribe lo que has consumido en electricidad (KWh) en los últimos 6 días: ");
        // Bucle para pedir los consumos
        for (int i = 0; i < consumo.length; i++) {
            
            System.out.println("Día " + (i + 1) + ": ");
            consumo[i] = teclado.nextDouble();
           
        }
        // Syso para ordenar los consumos
        for (int i = 0; i < consumo.length - 1; i++) {

            posmin = i;
            // Aqui miramos si el consumo de la posición j es menor que el consumo de la posición posmin
            // y si es así se cambia el valor de posmin por el de j
            for (int j = i + 1; j < consumo.length; j++) {
               
                  if (consumo[j] < consumo[posmin]) {
                    posmin = j;
                }
            }
            // Intercambio de valores
            aux = consumo[i];
            consumo[i] = consumo[posmin];
            consumo[posmin] = aux;
        }

        // Syso para mostrar los consumos ordenados usando el método Arrays.toString().
        System.out.println("Consumos ordenados de menor a mayor: ");
        System.out.println(Arrays.toString(consumo));

        // Syso para mostrar la mediana de los consumos usando los consumos de en medio de la tabla ordenada.
        // En este caso los valores de en medio son los de la posición 2 y 3, por lo que se hace la media de ambos.
        double mediana = (consumo[2] + consumo[3]) / 2;
        System.out.println("La mediana de los consumos ha sido de " + mediana + " KWh.");
        teclado.close();
        
        // Syso para mostrar quien es el mejor profesor
        System.out.println("Carlos és el mejor profesor de programación.");
    }
}
