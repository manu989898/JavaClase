package Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarManu {
    public static void main(String[] args) {
        
    
        Scanner escaner = new Scanner(System.in);
    
        int[] numeros = new int[10];
        int aux;
        int posmin;

        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Introduce un número: ");
            numeros[i] = escaner.nextInt();
        }
        escaner.close();
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length - 1; i++) {
            
            posmin = i;
            
            for (int j = i + 1; j < numeros.length; j++) {
                
                if (numeros[j] < numeros[posmin]) {
                    posmin = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[posmin];
            numeros[posmin] = aux;
            
            System.out.println("Array ordenado");
            System.out.println(Arrays.toString(numeros));
        }
    }
}
