package Actividades;

public class Ejer14d {
    public static void main(String[] args) {
        /*
         * Escribe un programa que rellene un array llamado primos con los 100 primeros
         * números
         * primos. Recuerda que un número entero es primo si no puede dividirse por
         * ninguno que no sea 1 o él mismo.
         * Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...u
        */
        int num = 2;
        boolean esPrrimo=true;
        int[] numeros = new int[100];
        int posicion = 0;
       
        while (true) {
            
            for (int i = 2; i <= num - 1; i++) {

                if (num % i == 0) {

                    esPrrimo = false;

                }

            }

            if (esPrrimo=true) {

                numeros[posicion] = num;
                posicion++;

            }

            if (posicion > 99) {
                break;
            }

            num++;

        }

        for (int k = 0; k < numeros.length; k++) {
            System.out.println(numeros[k]);
        }

    }
}
