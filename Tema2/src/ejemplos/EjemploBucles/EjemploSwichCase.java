package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploSwichCase {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Clasificacion del jugador (1 / 2 / 3): ");

        int clasificacion = entrada.nextInt();

        switch (clasificacion) {

            case 1:
                System.out.println("Medalla de Oro");
                break;
            case 2:
                System.out.println("Medalla de plata");
                break;
            case 3:
                System.out.println("Medalla de bronce");
                break;

            default:
                System.out.println("Lo siento no tienes medalla");

        }

        entrada.close();

    }

}
