package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio15 {

    /*
     *     Modifica el programa anterior para sólo haga el proceso si el número de mes que se ha introducido está entre 1 y 4            
     */
    public static void main(String[] args) {

    Scanner escaner = new Scanner(System.in);

        int mes;

        System.out.println("Ingresa el número de mes de entre enero o abril");
        mes = escaner.nextInt();


        if (mes>=1 && mes<=4) {

            
        }if (mes == 1) {

            System.out.println("Enero");

        } else if (mes == 2) {

            System.out.println("Febrero");

        } else if (mes == 3) {

            System.out.println("Marzo");

        } else if (mes == 4) {

            System.out.println("Abril");

        }else if (mes>4){

            System.out.println("El valor introducido es superior a 4");

        }

        escaner.close();
    }

}
