package actividades;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {

        /*
         * Escribe un método que escriba en pantalla el nombre de un mes a partir de su número. 
         * En caso de que el número proporcionado no esté entre 1 y 12, deberá terminar inmediatamente.
         */

        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa el tu mes favorito en forma numérica.");
        int seleccion = escaner.nextInt() -1;
        
        System.out.println("El mes elegido es: ");
        elegir(seleccion, mes);
        escaner.close();
    }




    static void elegir(int seleccion, String[] mes ) {

        if (seleccion>12 || seleccion<1) {
            return;
        }
        System.out.println(mes[seleccion]);
    }
}
