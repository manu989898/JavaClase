package Ejemplos;

import java.util.Scanner;

public class BusquedaArrayDesordenado {
    public static void main(String[] args) {
        
        

        Scanner escaner = new Scanner (System.in);

        double[] tallas = {37, 40, 40.5, 39, 45, 44, 43.5, 48, 42.5, 41.5};
        boolean encontrado = false;
        int i = 0;
        //Leemos una talla desde la terminal
        System.out.println("Introduce la talla que deseas buscar");

        double talla = escaner.nextDouble();

        //Buscamos si la talla se encuentra en el array
        for (i = 0; i< tallas.length; i++) {

            if (tallas[i] == talla) {

                encontrado=true;
                break;
            } 
        }

        if (encontrado = false){

            System.out.println("No encontramos la talla");

        } else {

            System.out.println("Tenemos la talla en stock");

        }
        escaner.close();
    }
}
