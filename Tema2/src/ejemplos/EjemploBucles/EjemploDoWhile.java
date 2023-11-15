package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {

        // Este programa pedira una serie de precios al usuario, cuando el usuario
        // introduzca un 0, el programa terminara y mostrara la suma de los precios introducidos

        // Declaracion de variables
        double precio;
        double suma = 0;
        Scanner Entrada = new Scanner(System.in);

        // Bucle do while
        do {
            
            System.out.println("Introduce un precio");
            precio = Entrada.nextDouble();
            suma = suma + precio;
       
        } while (precio != 0);

        System.out.println("La suma de los precios es: " + suma);

        Entrada.close();

    }
}
