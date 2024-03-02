package actividades.Bucles;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        double interes = 1.11;

        System.out.println("Introduce la cantidad que quieres pedir:");
        double cantidad = escaner.nextDouble();

        System.out.println("Ingresa la canridad de meses a pagar:");
        int meses = escaner.nextInt();

        System.out.println("Interes del: " + interes + "%. Incrementak +0.1 por mes.");
        double total = cantidad * interes;
        double cantidadMes = (cantidad/meses) * interes;
        for (int i = 0; i <= meses; i++) {
            
            interes = interes + 0.01;
            System.out.println("Mes " + i + " : " + (Math.round(cantidadMes * 10.00) /10.00) + " --- " + "interes del: " + Math.round(interes * 10.00)/10.00 + " %.");
            cantidadMes = (cantidad/meses) * interes;
            total = total + cantidadMes;
        }

        System.out.println("Va a pagar un total de: " + total);

    }}

