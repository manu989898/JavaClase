package Actividades.Hoja3;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        /*
         * Escribe una aplicación para una caja registradora. Irá pidiendo una serie de
         * precios y los irá
         * guardando en un array de 50 elementos (no es necesario que se rellene el
         * array completo).
         * 
         * Cada vez que se introduzca un precio, el programa comprobará si la suma
         * supera el valor 50 (que
         * estará guardado en una constante). A partir de ese momento, cada nuevo precio
         * se guardará rebajado
         * un 10%.
         * 
         * Cuando el cajero escriba un valor negativo, el programa entenderá que ha
         * terminado y mostrará la
         * lista de precios y el total que hay que cobrar al cliente.
         */

        Scanner escaner = new Scanner(System.in);
        
        //Declaramos el array de 50 elementos
        double[] precios = new double[50];

        //Declaramos la variable total
        double total = 0;

        //Declaramos la constante
        final double VALOR = 50;

        //Declaramos la variable para el descuento
        double descuento = 0;

        //Declaramos la variable para el contador
        int contador = 0;

        System.out.println("Caja Registradora");
        System.out.println("=================");
        //Bucle do while para que se repita mientras el valor introducido sea mayor que 0
        do {

            //Pedimos el precio
            System.out.println("Precio " + contador + ":");
            precios[contador] = escaner.nextDouble();

            

            //Condicion para que si el valor introducido es mayor que 50 se aplique el descuento
            if (total > VALOR) {

                //Calculamos el descuento
                descuento = precios[contador] * 0.90;
                precios[contador] = descuento;

                //Restamos el descuento a la variable total
                total = total + descuento;

            } else {

                //Sumamos el valor introducido a la variable total
                total = total + precios[contador];
            }
            
            //Sumamos 1 a la variable contador
            contador++;

        } while (precios[contador - 1] > 0);

        //Mostramos el array con los precios
        System.out.println("Ticket de la compra: ");
        for (int i = 0; i < contador - 1; i++) {

            System.out.println(precios[i]);
        }

        //Mostramos el total de la compra
        System.out.println("Total a pagar: " + total);

        escaner.close();
    }
}
