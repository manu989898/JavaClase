package actividades.Bucles;

public class Ejercicio11 {
    public static void main(String[] args) {

        /*
         * Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle while y haz
         * que la variable
         * contador se incremente de 5 en 5.
         */

        int contador = 0;
        int vuelta =1;

        while ((contador%5 == 0) && (contador < 1000)) {

            System.out.println("Número de vuelta:" + vuelta + "    " + "Múltiplo de 5:" + contador);
            vuelta ++;
            contador += 5;

        }

    }
}
