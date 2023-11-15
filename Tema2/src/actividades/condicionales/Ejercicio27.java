package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
       
        /*
         * Queremos diseñar un programa que solicite un número al usuario y le responda
         * "Es impar" o
         * "No es impar". Utiliza para ello la notación ? en lugar de if asignando a una
         * variable de tipo String
         * el resultado y mostrando después esta variable.
         */

        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa el número que deseas");
        int num;
        num = escaner.nextInt();

        String resultado = (num % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(resultado);

        escaner.close();

    }
}
