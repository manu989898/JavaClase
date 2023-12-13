package Actividades.Hoja2;

public class Ejer7 {
    public static void main(String[] args) {

        /*
         * La siguiente tabla guarda el número de espectadores que vieron La 2 a las
         * 23:00 horas, cada día
         * de la semana. Escribe un programa que busque el máximo y el mínimo de
         * audiencia en esta semana.
         * Día Espectadores
         * Lunes 2.000.000
         * Martes 2.500.000
         * Miércoles 3.100.000
         * Jueves 3.000.000
         * Viernes 1.200.000
         * Sábado 1.800.000
         * Domingo 2.050.000
         * usar array una dimension
         */

        //Declaramos arrays
        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

        //Declaramos variables
        String diaMax = "";
        String diaMin = "";
        int max = espectadores[0];
        int min = espectadores[0];

        //Recorremos el array
        for (int i = 0; i < espectadores.length; i++) {

            //Comprobamos si el valor actual es mayor o menor que el maximo y minimo y lo asignamos
            if (espectadores[i] > max) {
                max = espectadores[i];
                diaMax = dias[i];

            }
            //Comprobamos si el valor actual es menor o mayor que el minimo y maximo y lo asignamos
            if (espectadores[i] < min) {
                min = espectadores[i];
                diaMin = dias[i];
            }
        }
        //Mostramos los resultados
        System.out.println("El día con más espectadores fue el " + diaMax + " con " + max + " espectadores");
        System.out.println("El día con menos espectadores fue el " + diaMin + " con " + min + " espectadores");
    }
}
