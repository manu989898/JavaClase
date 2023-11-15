package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        
        //EJEMPLO DE IF - ELSE IF - ELSE

        /*
         * Tenemos una rifa donde se saca un numero de cuatro cifras al azar.
         * Si el jugador acierta 1 número, cobrará 10 euros, si acierta 2 números cobrará 30 euros,
         * si acierta tres números cobrará 50 euros, si acierta los cuatro números cobrará 100 euros.
         */

        int cantidadAcertada;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Cuántos números acertaste?");
        cantidadAcertada = escaner.nextInt();

        if (cantidadAcertada == 1) {

            System.out.println("Le tocan 10 euros");

        } else if (cantidadAcertada ==2 ) {

            System.out.println("Le tocan 30 euros");            

        } else if (cantidadAcertada==3) {

            System.out.println("Le tocan 50 euros");

        } else if (cantidadAcertada==4){

            System.out.println("Le tocan 100 euros");

        } else {

            System.out.println("Sólo puede ser un número del 1 al 4!");

        }

        System.out.println("Gracias por jugar!");

        escaner.close();
    }
    
}
