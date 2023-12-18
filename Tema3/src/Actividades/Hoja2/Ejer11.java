package Actividades.Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        /*
         * Crea una aplicación que ordene de menor a mayor la lista de edades de los
         * diez alumnos de un
         * curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola.
         */

        Scanner escaner = new Scanner(System.in);

        //Declaramos el array
        int[] edades = new int[10];

        //Declaramos la variable auxiliar
        int aux = 0;

        //Bucle for para pedir las edades
        for (int i = 0; i < edades.length; i++) {

            //Pedimos la edad
            System.out.println("Edad " + i + ":");
            edades[i] = escaner.nextInt();
        }

        //Bucle for para ordenar el array
        for (int i = 0; i < edades.length - 1; i++) {

            //Bucle for para comparar los valores del array
            for (int j = i + 1; j < edades.length; j++) {

                //Condicion para comparar los valores del array
                if (edades[i] > edades[j]) {

                    //Asignamos el valor de la posicion i a la variable aux
                    aux = edades[i];

                    //Asignamos el valor de la posicion j a la posicion i
                    edades[i] = edades[j];

                    //Asignamos el valor de la variable aux a la posicion j
                    edades[j] = aux;
                }
            }
            System.out.println(Arrays.toString(edades));
        }   
        escaner.close();
    }
}
