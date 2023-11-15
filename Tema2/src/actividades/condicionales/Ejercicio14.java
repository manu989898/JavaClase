package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        /*
         * Crea una aplicación que pida el número de mes y devuelva el nombre del mes
         * (basta que lo haga para los meses de enero a abril).
         */

        Scanner escaner = new Scanner(System.in);

        int mes;

        System.out.println("Ingresa el número de mes de entre enero o abril");
        mes = escaner.nextInt();

        if (mes == 1) {

            System.out.println("Enero");

        } else if (mes == 2) {

            System.out.println("Febrero");

        } else if (mes == 3) {

            System.out.println("Marzo");

        } else if (mes == 4) {

            System.out.println("Abril");

        }

        escaner.close();
    }

}
