package Ejemplos;

public class MetodoPrimo {
    public static void main(String[] args) {

        /*
         * Programa que con un metodo compruebe los números primos que hay entre 0 y
         * 1000;
         */

        int numero = 0;
        for (int i = 0; i < 1000; i++) {

            if (esPrimo(numero)) {

                System.out.println("Número primo: " + numero);
                numero++;
            } else {

                numero++;
            }
        }
    }

    public static Boolean esPrimo(int numero) {

        Boolean esPrimoActual = true;
        if (numero < 2) {

            esPrimoActual = false;
        } else {

            for (int x = 2; x <= (numero / 2); x++) {

                if (numero % x == 0) {

                    esPrimoActual = false;
                    break;
                }
            }
        }
        return esPrimoActual;
    }
}
