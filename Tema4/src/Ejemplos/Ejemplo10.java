package Ejemplos;

public class Ejemplo10 {
    public static void main(String[] args) {
        
        /*
         * Ejemplo de paso por referencia.(modifica el array original).
         */

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Antes de llamar al método: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Llamamos al método que modifica el array
        modificarArray(array);

        System.out.println("Después de llamar al método: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

        // Creamos el metodo que modifica el array
        static void modificarArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 2;
            }
        

    }
}
