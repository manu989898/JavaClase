package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
         * Crea un programa que calcule la hora de cierre de una tienda. Esta hora
         * depende del valor de
         * una variable de tipo String llamada dia. Si su valor es "entre semana", la
         * hora de cierre de la tienda
         * será "20:00". En otro caso, la hora de cierre será "14:00".
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Si es entre semana escribe: entre semana, sino escribe cualquier otra cosa");

        String dia = entrada.nextLine();

        String horaCierre = (dia.equals("entre semana")) ? "20:00" : "14:00";

        System.out.println("La hora de cierre es: " + horaCierre);

        entrada.close();

    }
}
