package actividades.Bucles;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Escribe un programa que solicite un número al usuario y, a continuación,
        // muestre la tabla de multiplicar de ese número.
        // usando Scanner

        // Declaración de variables
        int numero;

        // Inicialización de variables
        numero = 0;

        // Pedir datos
        System.out.println("Introduce un número: ");
        numero = Integer.parseInt(System.console().readLine());

        // Mostrar resultados
        for (int i = 0; i <= 10; i++) {

            // i = al divisor y numero = al dividendo y numero * i = al resultado
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
