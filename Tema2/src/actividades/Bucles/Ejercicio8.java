package actividades.Bucles;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Crea un programa que muestre todos los números impares menores de 200.

        int num = 1;

        while (num % 2 != 0 && (num < 200)) {

            System.out.println(num);
            num = num + 2;
        }

    }
}
