package ejemplos.EjemploBucles;

public class EjemploBucles {
    public static void main(String[] args) {
        
        /*
         * BUCLES
         * 
         * Un bucle es una estructura de control que permite repetir un bloque de
         * instrucciones.
         * 
         * En Java tenemos 3 tipos de bucles: while, do-while y for.
         * 
         * 
         * BUCLE WHILE
         * 
         * Sintaxis:
         * 
         * while (condición) {
         *      bloque de instrucciones
         * }
         * 
         * El bloque de instrucciones se ejecuta mientras la condición sea verdadera.
         * 
         * 
         * BUCLE DO-WHILE
         * 
         * Sintaxis:
         * 
         * do {
         *      bloque de instrucciones
         * } while (condición);
         * 
         * El bloque de instrucciones se ejecuta mientras la condición sea verdadera.
         * 
         * La diferencia con el bucle while es que el bloque de instrucciones se ejecuta
         * al menos una vez, ya que la condición se evalúa al final.
         * 
         * 
         * BUCLE FOR
         * 
         * Sintaxis:
         * 
         * for (inicialización; condición; incremento) {
         *      bloque de instrucciones
         * }
         * 
         * El bloque de instrucciones se ejecuta mientras la condición sea verdadera.
         * */

        // Bucle while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Bucle do-while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        // Bucle for
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }


    }
}
