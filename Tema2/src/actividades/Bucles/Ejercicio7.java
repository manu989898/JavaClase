package actividades.Bucles;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Crea un programa que escriba los 50 primeros números pares.

        int num = 0;
        int vuelta = 0;
        while (vuelta <= 50) {

            System.out.println(vuelta + " El numero: " + num);
            vuelta++;
            num = num + 2;

        }

    }
}
