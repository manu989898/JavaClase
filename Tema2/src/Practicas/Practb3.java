package Practicas;

import java.util.Scanner;

public class Practb3 {
    public static void main(String[] args) {
        /*
         * Actividad 3
         * Modifica el programa del ejercicio anterior para que si el usuario pone una
         * cantidad de dinero no
         * válida (o sea, una cantidad no positiva), se le siga preguntando hasta que lo
         * haga bien.
         */
        String seleccionado = "";
        double dinero = 1;
        double precio = 00;
        double cambio = dinero - precio;
        Scanner escaner = new Scanner(System.in);
        String uno = ("(1) Lata 33 cl coca-cola");
        String dos = ("(2) Lata 33 cl Aquarius");
        String tres = ("(3) Patatillas onduladas");
        String cuatro = ("(4) Botella 50 cl agua");

        System.out.println("===== MÁQUINA EXPENDEDORA ====");
        System.out.println("Productos a la venta");
        System.out.println("==============================");
        System.out.println(uno + "   1,30€");
        System.out.println(dos + "    1,50€");
        System.out.println(tres + "   2€");
        System.out.println(cuatro + "     1€");

        while (true) {

            // Preguntamos que quiere comprar
            System.out.println("\n¿Que quieres comprar?");
            int num = escaner.nextInt();

            // Condición de si está lo seleccionado entre 1 y 4 (incluidos)
            if (num <= 4 && num >= 1) {

                System.out.println("\n¿Cuanto dinero quiere introducir?");
                dinero = escaner.nextDouble();

                if (dinero <= 0) {

                    System.out.println("\nDebe introducir una cantidad válida (mayor o igual a cero)");
                    System.out.println("\n¿Cuanto dinero quiere introducir?");
                    dinero = escaner.nextDouble();

            }else {

                System.out.println("\nEl producto no exsiste.");

            }
        }
    }
}
}
