package Actividades;

public class Ejer14b {
    public static void main(String[] args) {
        /*
         * Escribe un programa que rellene un array llamado primos con los 100 primeros
         * números
         * primos. Recuerda que un número entero es primo si no puede dividirse por
         * ninguno que no sea 1 o él mismo.
         * Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...
         */
        
        int[] primos = new int[100];
        int count = 0;
        int num = 2;

        while (count < 100) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
