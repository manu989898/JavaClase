package Actividades.Hoja2;

import Actividades.Hoja2.ActividadesLibres.Arrays;

public class Ejer12 {
    public static void main(String[] args) {

        /*
         * La siguiente tabla muestra los números atómicos de los elementos que forman
         * una muestra de un material desconocido. Escribe un programa que los muestre ordenados de
         * menor a mayor. Al
         * final también indicará el número atómico menor y el mayor.
         */

        int[] numeros = {8, 2, 10, 20, 12, 71, 15, 23};

        //Declaramos la variable auxiliar
        int aux = 0;

        //Bucle for para ordenar el array
        for (int i = 0; i < numeros.length - 1; i++) {

            //Bucle for para comparar los valores del array
            for (int j = i + 1; j < numeros.length; j++) {

                //Condicion para comparar los valores del array
                if (numeros[i] > numeros[j]) {

                    //Asignamos el valor de la posicion i a la variable aux
                    aux = numeros[i];

                    //Asignamos el valor de la posicion j a la posicion i
                    numeros[i] = numeros[j];

                    //Asignamos el valor de la variable aux a la posicion j
                    numeros[j] = aux;
                }
            }
        }
        //Mostramos el array ordenado
        System.out.println("Array ordenado: ");
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + ", ");
        }

        System.out.println();
        
        //Mostramos el numero atómico menor
        System.out.println("Número atómico menor: " + numeros[0]);

        //Mostramos el numero atómico mayor
        System.out.println("Número atómico mayor: " + numeros[numeros.length - 1]);
    }
}
