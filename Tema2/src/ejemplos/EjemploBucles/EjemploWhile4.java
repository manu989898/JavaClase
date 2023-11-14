package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploWhile4 {
    public static void main(String[] args) {

        // Un programa que vaya pidiento nombres de personas al usuario hasta que
        // introduzca Pepe.
        Scanner escaner = new Scanner(System.in);
        String nombres = "";

        System.out.println("Introduce un nombre");

        //Usamos ! para negar la condicion
        while (!nombres.equals("Pepe")) {

            System.out.println("Introduce un nombre");
            nombres = escaner.nextLine();
        }
        escaner.close();
    }
}
