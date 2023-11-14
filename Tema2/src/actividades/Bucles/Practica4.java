package actividades.Bucles;
import java.util.Scanner;
public class Practica4 {
    public static void main(String[] args) {

        /*
         * Crea un programa que pregunte al usuario el nombre de una estación del año. A
         * continuación le dirá en qué fecha empieza dicha estación. En caso de que el
         * usuario escriba un nombre que no corresponda a una estación, el programa le
         * responderá con la frase: "Tienes que escribir el nombre de una estación".El
         * proceso se repetirá indefinidamente, hasta que el usuario introduzca la
         * palabra "stop".
         * Utiliza la instrucción switch.
         */

        Scanner escaner = new Scanner(System.in);
        String estacion = "verano";

        System.out.println("Escribe el nombre de una estación del año");
        estacion = escaner.nextLine();

        switch (estacion) {

            case "verano":
                System.out.println("El verano empieza el 21 de junio");
                break;
            case "otoño":
                System.out.println("El otoño empieza el 21 de septiembre");
                break;
            case "invierno":
                System.out.println("El invierno empieza el 21 de diciembre");
                break;
            case "primavera":
                System.out.println("La primavera empieza el 21 de marzo");
                break;
            case "stop":
                break;
            default:
                System.out.println("Tienes que escribir el nombre de una estación");
                break;

        }

        escaner.close();
    }
}
