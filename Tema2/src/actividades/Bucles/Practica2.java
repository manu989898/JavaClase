package actividades.Bucles;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que lea desde teclado los tiempos (en segundos) que han
         * hecho los ocho jugadores de una carrera y devuelva la suma de estos tiempos y
         * el tiempo medio que han hecho. Usa un bucle for.
         */

        Scanner escaner = new Scanner(System.in);
        
        double tiempo;
        double total = 0;
        int condicion = 8;

        for (int i = 1; i <= condicion; i++){
            System.out.println("ingresa el tiempo del jugador " + i );
            tiempo = escaner.nextDouble();
            total = total+tiempo;
        }

        System.out.println("El total de tiempo es igual que alex de guapo: " + total);
        System.out.println("La media de tiempo es: " + (total/condicion));

        escaner.close();
        
    }
}
