package Actividades.cadenas;

import java.util.Scanner;

public class cosas {
    public static void main(String[] args) {
         /*
          * UN PROGRAMA QUE CON UNA LISTA DE CANTIDADES RESUELVA CUALES SON NECESARIAS PARA SUMAR UNA CANTIDAD DADA deben de ser tipo float

          */
        Scanner escaner = new Scanner(System.in);

        System.out.println("introduce una cantidad: ");
        float cantidad = escaner.nextFloat();

        System.out.println("introduce una serie de números: ");

        float[] numeros = new float[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = escaner.nextFloat();
        }

        escaner.close();

        float suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        if (suma < cantidad) {
            System.out.println("no se puede sumar la cantidad");
        } else {
            float sumaParcial = 0;
            int i = 0;
            while (sumaParcial < cantidad) {
                sumaParcial += numeros[i];
                i++;
            }
            System.out.println("se necesitan " + i + " números para sumar la cantidad");
        }
        //mostrar que cantidades del array se necesitan para sumar la cantidad

        float sumaParcial = 0;
        int i = 0;
        while (sumaParcial < cantidad) {
            sumaParcial += numeros[i];
            i++;
        }

        System.out.println("se necesitan " + i + " números para sumar la cantidad");

        for (int j = 0; j < i; j++) {
            System.out.println(numeros[j]);
        }

        
    }
}


        