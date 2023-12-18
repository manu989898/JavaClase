package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * Crea una aplicación que vaya leyendo y guardando en un array las estaturas de
         * 10 personas. A continuación, recorrerá el array y nos informará de si alguna de estas
         * estaturas es mayor de 1'90 m.
         */

        Scanner escaner = new Scanner(System.in);
        
        int[] alturas = new int[10];

        for (int i = 0; i<alturas.length; i++) {

            System.out.println("Introduce la altura nº" + (i +1) + ", en centimetros:");
            alturas[i] = escaner.nextInt();

            if (alturas[i] > 190) {

                System.out.println("La altura introducida es superior a 190cm");
                break;
            }

        }
        escaner.close();
    }
}
