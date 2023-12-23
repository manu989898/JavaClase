package Ejemplos;

public class PrintF {
    public static void main(String[] args) {

        /*
         * Como usar printf
         */

        // Declaramos el array bidimensional
        String[][] calificaciones = {
                { "Jose Luis Martínez", "7" },
                { "Antonia Ruiz", "9" },
                { "Marcos Ramírez", "10" },
                { "Juana Herranz", "4" },
                { "Alberto López", "7" } };

        System.out.printf("\n%-20s %-4s \n", "Nombre y Apellidos", "Nota");
        System.out.printf("%-20s %-4s \n", "====================", "====");
        for (int fila = 0; fila < calificaciones.length; fila++) {

            System.out.printf("%-20s %-4s \n", calificaciones[fila][0], calificaciones[fila][1]);

        }
    }
}
// %-20s -> 20 espacios a la izquierda
// %2s -> 2 espacios a la derecha
// \n -> salto de linea
// %s -> string
// %d -> int
// %f -> float
// %c -> char
// %b -> boolean
// %e -> notacion cientifica
// %x -> hexadecimal
// %o -> octal
// %t -> fecha
// %n -> salto de linea
// %% -> % literal
// %, -> separador de miles
// %f -> float
// %e -> notacion cientifica
// %g -> float o notacion cientifica
// %a -> hexadecimal
