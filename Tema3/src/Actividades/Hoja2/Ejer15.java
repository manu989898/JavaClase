package Actividades.Hoja2;

public class Ejer15 {
    public static void main(String[] args) {

        /*
         * /*
         * Esta tabla muestra los nombres y precios de cuatro artículos de unos grandes
         * almacenes:
         * Producto Precio (€)
         * Tablet Samsung 120
         * Móvil Sony 115
         * Ipad Mini 290
         * Móvil HTC 95
         * Guarda la información en un array llamado precios. Después, muestra esta
         * información en pantalla
         * y calcula el precio total de los cuatro artículos.
         * Ayuda: Puedes convertir un String a float con el método:
         * Float.parseFloat(numero_float);
         * Añade al programa anterior otro bucle que recorra el array y encuentre el
         * menor y el mayor precio
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
        float precioMax = 0;
        float precioMin = 0;
        int contadorMax = 0;
        int contadorMin = 0;
        
        // Calculamos el precio total
        for (int i = 0; i < precios.length; i++) {

            // Sumamos el precio actual al precio total
            // Convertimos el precio actual a float con el método Float.parseFloat()
            precioTotal += Float.parseFloat(precios[i][1]);
        }

        // Mostramos el precio total
        System.out.println("El precio total es: " + precioTotal);

        // Calculamos el precio máximo y el precio mínimo        
        // Recorremos el array
        for (int i = 0; i < precios.length; i++) {

            // Comprobamos si estamos en la primera posición
            if (i == 0) {

                // Asignamos el valor actual a la variable precioMax y precioMin
                precioMax = Float.parseFloat(precios[i][1]);
                precioMin = Float.parseFloat(precios[i][1]);
            }

            // Comprobamos si el precio actual es mayor que el precio máximo
            if (Float.parseFloat(precios[i][1]) > precioMax) {

                // Asignamos el valor actual a la variable precioMax
                precioMax = Float.parseFloat(precios[i][1]);
                contadorMax = i;
            }

            // Comprobamos si el precio actual es menor que el precio mínimo
            if (Float.parseFloat(precios[i][1]) < precioMin) {

                // Asignamos el valor actual a la variable precioMin
                precioMin = Float.parseFloat(precios[i][1]);
                contadorMin = i;
            }
        }

        // Mostramos el precio máximo y el precio mínimo junto al nombre del producto
        System.out.println("El precio máximo es: " + precioMax + " y corresponde al producto: " + precios[contadorMax][0]);
        System.out.println("El precio mínimo es: " + precioMin + " y corresponde al producto: " + precios[contadorMin][0]);       
    }
}
