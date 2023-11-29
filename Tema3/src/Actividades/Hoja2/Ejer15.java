package Actividades.Hoja2;

public class Ejer15 {
    public static void main(String[] args) {

        
         /*
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
         * Integer.parseInt(numero_int);
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
        int posMin=0;
        int posMax=0;
        
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

            if (Float.parseFloat(precios[i][1])< Float.parseFloat(precios[posMin][1])){

                posMin=i;
            }
            if (Float.parseFloat(precios[i][1])> Float.parseFloat(precios[posMax][1])){
                
                posMax=i;
            }
        }
        // Mostramos el precio máximo y el precio mínimo junto al nombre del producto
        System.out.println("El precio máximo es: " + precios[posMax][1] + " y corresponde al producto: " + precios[posMax][0]);
        System.out.println("El precio mínimo es: " + precios[posMin][1] + " y corresponde al producto: " + precios[posMin][0]);       
        
    }
}

