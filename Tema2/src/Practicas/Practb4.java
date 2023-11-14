package Practicas;

import java.util.Scanner;

public class Practb4 {
    public static void main(String[] args) {
        
        /*
         * Escribe un programa que actúe como una máquina expendedora. Al arrancar,
         * mostrará las opciones
         * que hay de compra. A continuación preguntará qué quiere comprar el usuario y,
         * después, cuánto
         * dinero quiere introducir.
         */

        //Declaración de variables.
        String seleccionado = "";
        double dinero = 1;
        double precio = 00;
        double cambio = dinero - precio;

        Scanner escaner = new Scanner(System.in);
        String uno = ("(1) Lata 33 cl coca-cola");
        String dos = ("(2) Lata 33 cl Aquarius");
        String tres = ("(3) Patatillas onduladas");
        String cuatro = ("(4) Botella 50 cl agua");

        //"IGU" de la máquina
        System.out.println("===== MÁQUINA EXPENDEDORA ====");
        System.out.println("Productos a la venta");
        System.out.println("==============================");
        System.out.println(uno + "   1,30€");
        System.out.println(dos + "    1,50€");
        System.out.println(tres + "   2€");
        System.out.println(cuatro + "     1€");

        //Inicializo un bucle infinito para usar lo máximo aprendido en clase
        while (true) {

            //Preguntamos que quiere comprar
            System.out.println("\n¿Que quieres comprar?");
            int num = escaner.nextInt();

            //Condición de si está lo seleccionado entre 1 y 4 (incluidos)
            if (num <= 4 && num >= 1) {

                System.out.println("\n¿Cuanto dinero quiere introducir?");
                dinero = escaner.nextDouble();

                if (dinero <= 0) {

                    System.out.println("\nDebe introducir una cantidad válida (mayor o igual a cero)");
                    System.out.println("\n¿Cuanto dinero quiere introducir?");
                    dinero = escaner.nextDouble();

                }

                // Uso un switch para asignarle precio y nombre del producto
                // en función del valor de num que es el producto seleciconado.
                switch (num) {
                    case 1:
                        precio = 1.30;
                        seleccionado = "Coca-Cola";
                        break;
                    case 2:
                        precio = 1.50;
                        seleccionado = "Aquarius";
                        break;
                    case 3:
                        precio = 2;
                        seleccionado = "Patatillas onduladas";
                        break;
                    case 4:
                        precio = 1;
                        seleccionado = "Agua";
                        break;

                }

                // Uso este else para que si num no vale ninguno de esos 4 casos imprima que el
                // producto no exsiste
            } else {

                System.out.println("\nEl producto no exsiste.");

            }

            // Si num esta entre los valores de arriba entrará en el if
            if (num <= 4 && num >= 1) {

                // Si el dinero introducido es mayor que el preico del producto
                if (dinero > precio) {

                    System.out.println("Tome su " + seleccionado);
                    System.out.println("Tu cambio es de " + (dinero - precio) + "€");
                    System.out.println("Hasta pronto!");
                    break;

                    // Si el dinero introducido es menor que el precio del producto
                } else {

                    System.out.println("\nNo ha introducido suficiente dinero.");
                    System.out.println("Le faltan " + (precio - dinero) + " €");
                    break;

                }
            }
        }
        escaner.close();
    }
}

