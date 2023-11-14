package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Dada una compra, si supera los 100 euros tendrá un descuento del 10%, sino lo
        // tendrá del 5%.

        System.out.println("Introduce el importe de la compra: ");
        float importe = entrada.nextFloat();

        /* con if-else
          if (importe <= 100) {
          System.out.println("El importe de la compra es: " + (importe - (importe *
          0.05)));
          } else {
          System.out.println("El importe de la compra es: " + (importe - (importe *
          0.1)));
          }
         */
        
         // Operador ternario
        String total = (importe <= 100) ? "El importe de la compra es: " + (importe - (importe * 0.05))
                : "El importe de la compra es: " + (importe - (importe * 0.1));

        System.out.println(total);
        entrada.close();

    }

}
