package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
         * Escribe una aplicación que pregunte al usuario un número entre 1 y 5. Si
         * responde "3", se le
         * felicitará por haber acertado. Si no, se le seguirá pidiendo más números.
         */

         Scanner escaner = new Scanner(System.in);
        
        int num=4;
        while ( num != 3 ){

            System.out.println("Ingresa un número entre 1 y 5");
            num = escaner.nextInt();
        } 
        System.out.println("Felicidades, acertaste");
        escaner.close();
    }
}
