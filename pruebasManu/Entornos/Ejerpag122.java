package Actividades.cadenas;

import java.util.Scanner;

public class Ejerpag122 {
    public static void main(String[] args) {
        int num, i=2;
        boolean primo=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = sc.nextInt();
        //---------------------------1---------------------------
        while (i<= num/2 && primo==true) {
        //---------------------------2 y 3-----------------------
            if (num % i == 0) {
        //---------------------------4---------------------------
                primo = false;
        //---------------------------5---------------------------
            }
            i++;            
        //---------------------------6---------------------------
        }
        //---------------------------7---------------------------
        if (primo==true) {
        //---------------------------8---------------------------
            System.out.println("El número es primo");
        //---------------------------9---------------------------
        } else {
        //---------------------------10---------------------------
            System.out.println("El número no es primo");
        //---------------------------11---------------------------
        }
        sc.close();
    }
}
