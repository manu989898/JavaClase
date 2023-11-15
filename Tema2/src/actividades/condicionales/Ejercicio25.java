package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*
         * Crea un programa que pregunte el nombre del usuario y luego lo escriba. Ahora
         * bien, si el
         * usuario no introduce nada, el nombre deberá quedar con el valor
         * "Desconocido".
         */

        Scanner escaner = new Scanner(System.in);
        String nombre = "Desconocido";
        String resultado;

        System.out.println("Cual es tu nombre?");
        
        nombre = escaner.nextLine();

        resultado = nombre.equals("") ? "Tu nombre es desconocido " : "tu nombre es " + nombre;

        System.out.println(resultado);
        escaner.close();
    }
}
