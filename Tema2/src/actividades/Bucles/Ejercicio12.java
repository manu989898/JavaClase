package actividades.Bucles;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*
         * Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino
         * que, al final,
         * simplemente se muestre la suma de todos ellos. Utiliza un bucle while.
         */
        int contador = 0;
        int vuelta = 1;
        int total = contador;

        while (contador <= 1000) {

            System.out.println("num de vueltas:" + vuelta + "     " + "total:" + total);
            vuelta++;
            contador = contador + 5;
            total = total + contador;
        }

        System.out.println(total);

    }
}
