package actividades.Bucles;

public class Ejercicio15 {

    public static void main(String[] args) {

        /*
         * Crea una aplicación que calcule una lista con las potencias de 3 menores que
         * 12000. Haz que
         * en cada pasada del bucle se muestre el exponente y el valor de la potencia.
         * Utiliza un bucle do-while.
         * Ayuda: Recuerda que para elevar un número a otro usamos la función
         * Math.pow(base, exponente).
         */

        System.out.println("*** Lista de potencias de 3 menores que 12000 ***");

        int exponente = 0;
        int potencia = 1;

        do {
           
            System.out.println("3 elevado a " + exponente + " = " + potencia);
           
            potencia = (int) Math.pow(3, exponente);

            exponente++;

        } while (potencia < 12000);

    }

}
