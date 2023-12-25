package Ejemplos;

import java.util.Arrays;

public class Ejemplo7 {
    public static void main(String[] args) {
        /*
         * metodo de ordnacion
         * 
         */

        int[] numeros = { 5, 3, 2, 1, 4 };

        int aux=0;
        int posMin=0;
        
        for (int i = 0; i < numeros.length-1; i++) {
            
            posMin=i;

            for (int j = i + 1; j < numeros.length; j++) {
                
                if (numeros[j] < numeros[posMin]){

                    posMin = numeros[j];
                }
                
            }
            aux = numeros[i];
            numeros[i] = numeros[posMin];
            numeros[posMin] = aux;

            System.out.println(Arrays.toString(numeros));
        }
        
    }
}
