package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {

        /*
         * Escribe un programa que pida 10 precios de productos y los guarde en un array
         * llamado
         * productos. Después recorrerá el array hasta encontrar un precio menor que 0.
         * Si lo encuentra
         * escribirá el mensaje
         * "Se ha encontrado un valor no válido en la posición x. El programa terminará"
         * (x es la posición del array donde está ese dato). Si no lo encuentra,
         * calculará la suma de todos los
         * precios y la mostrará.
         * Utiliza una variable semáforo llamada preciosCorrectos, que valdrá true si
         * todos los precios son
         * mayores o iguales a cero, y false si se encuentra un número negativo.
         */

        Scanner scan = new Scanner(System.in);
        
        double[] productos = new double[10];
        boolean preciosCorrectos = true;
        double suma = 0;
        int i = 0;

        for (i = 0; i < productos.length; i++) {

            System.out.println("Introduce el precio del producto nº" + (i + 1) + ":");
            productos[i] = scan.nextDouble();

            if (productos[i] < 0) {

                preciosCorrectos = false;
                break;
            }
        }

        if (preciosCorrectos) {

            for (i = 0; i < productos.length; i++) {

                suma += productos[i];
            }

            System.out.println("La suma de los precios es: " + suma);
        } else {

            System.out.println("Se ha encontrado un valor no válido en la posición " + i + ". El programa terminará");
        }
        
    }

}
