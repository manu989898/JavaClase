package Actividades.Hoja1;

public class Ejer14c {
    public static void main(String[] args) {
        /*
         * /*
         * Escribe un programa que rellene un array llamado primos con los 100 primeros
         * números
         * primos. Recuerda que un número entero es primo si no puede dividirse por
         * ninguno que no sea 1 o él mismo.
         * Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...
         */

        int[] nums = new int[100];
        int num = 2;
        boolean esPrrimo = true;

        for (int j = 0; j <= nums.length; j++) {

            for (int i = 2; i <= num - 1; i++) {

                if (num % i == 0) {

                    esPrrimo = false;

                }

            }

            if (esPrrimo = true) {
                nums[j] = num;
                num++;
            } else {
                num++;
            }

        }
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }
    }
}