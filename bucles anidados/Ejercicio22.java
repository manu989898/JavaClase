public class Ejercicio22 {
    public static void main(String[] args) {
        //Escribe una aplicación que muestre las tablas de multiplicar del 1 al 10.
        //Debes usar bucles anidados.

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        
    }
}
