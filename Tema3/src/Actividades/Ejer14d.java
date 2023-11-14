package Actividades;

public class Ejer14d {
    public static void main(String[] args) {
        /*programa que pida un número y dice si es primo o no.num-1 y 2*/
        int num = 2;
        boolean esPrrimo=true;

        for (int i = 2; i<=num-1 ; i++){

            if (num%i==0) {

                esPrrimo = false;
                System.out.println("false");
            } 

        }

    }
}
