package Actividades.Hoja1;

public class Ejer14 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que rellene un array llamado primos con los 100 primeros
         * números
         * primos. Recuerda que un número entero es primo si no puede dividirse por
         * ninguno que no sea 1 o él mismo.
         * Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...
         */

        boolean esPrimo;
        int contador = 0;

        int[] primos = new int[100];

        for (int n = 2; contador < primos.length; n ++) {
           
            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n) && esPrimo; i ++) {
                if ((n % i) == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primos[contador] = n;
                contador ++;
            } 
        }
        
        System.out.println("Lista descendente de números primos:");
        for (int n = contador - 1; n >= 0; n --) {
            System.out.println(n + 1 + "º: " + primos[n]);
        }
    }
}
