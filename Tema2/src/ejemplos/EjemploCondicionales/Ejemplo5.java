package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        
        /*
         * Programa que te pregunte en que color está el semáforo y te diga so tienes
         * que pasar, que frenar o frenar si te da tiempo
         */

        Scanner escaner = new Scanner(System.in);

        String posicionSemaforo;

        System.out.println("Ingresa el estado del semaforo, verde/rojo/naranja");
        posicionSemaforo = escaner.nextLine();

        if (posicionSemaforo.equals("verde")){

            System.out.println("Puedes pasar!");

        } else if (posicionSemaforo.equals("rojo")){

            System.out.println("Debes parar!");

        } else {

            System.out.println("Para si puedes!");

        }

        escaner.close();
    }
    
}
