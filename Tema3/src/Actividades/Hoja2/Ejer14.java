package Actividades.Hoja2;

public class Ejer14 {

    public static void main(String[] args) {

        /*
         * Esta tabla muestra los nombres y precios de cuatro artículos de unos grandes
         * almacenes:
         * Producto Precio  (€)
         * Tablet Samsung   120
         * Móvil Sony       115
         * Ipad Mini        290
         * Móvil HTC        95
         * Guarda la información en un array llamado precios. Después, muestra esta
         * información en pantalla
         * y calcula el precio total de los cuatro artículos.
         * Ayuda: Puedes convertir un String a float con el método:
         * Float.parseFloat(numero_float);
         */

        // Declaramos el array bidimensional
        String[][] precios = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
                { "Móvil HTC", "95" } };
        
        // Mostramos el array bidimensional
        System.out.println("Array bidimensional: ");

        for (int i = 0; i < precios.length; i++) {

            for (int j = 0; j < precios[i].length; j++) {

                System.out.print(precios[i][j] + " ");
            }

            System.out.println();
        }

        // Declaramos variables
        float precioTotal = 0;

        // Calculamos el precio total
        for (int i = 0; i < precios.length; i++) {

            // Sumamos el precio actual al precio total
            // Convertimos el precio actual a float con el método Float.parseFloat()
            precioTotal += Float.parseFloat(precios[i][1]);
        }

        // Mostramos el precio total
        System.out.println("El precio total es: " + precioTotal);



    }

}
