package Actividades.Hoja2;

public class Ejer16 {
    
    public static void main(String[] args) {
        // escribe un programa que lea una secuencia de números enteros y los guarde en un array.
        // el programa debe terminar cuando se introduzca un número negativo.
        // a continuación, el programa debe mostrar la media de los números positivos introducidos.
        // por último, el programa debe mostrar cuántos números pares e impares se han introducido.
        // para ello, crea un método que reciba el array y devuelva un array de dos elementos, el primero
        // con el número de pares y el segundo con el número de impares.
        // por ejemplo, si se introduce 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, el programa debe mostrar:
        // media: 5



        // pares: 4



        // impares: 5

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

        // Mostramos el precio máximo y el precio mínimo
        System.out.println("El precio máximo es: " + precioMax);
        System.out.println("El precio mínimo es: " + precioMin);

        // Mostramos el producto más caro y el más barato
        System.out.println("El producto más caro es: " + precios[contadorMax][0]);
        System.out.println("El producto más barato es: " + precios[contadorMin][0]);

    }

}
