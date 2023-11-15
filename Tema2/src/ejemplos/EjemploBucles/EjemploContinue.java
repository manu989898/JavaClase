package ejemplos.EjemploBucles;

public class EjemploContinue {
    public static void main(String[] args) {
        /*
         * Programa que muestre los números que sean múltiplos de 5 pero no de 50 hasta
         * el 200.
         */

        int i = 0;

        while (i <= 200) {

            i = i + 5;

            // en este caso si es multiplo de 50 se ejecutara el continue, el buble volverá a aempezar saltandose el syso.
            if (i % 50 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
