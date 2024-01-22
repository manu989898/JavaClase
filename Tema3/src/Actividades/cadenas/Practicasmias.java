package Actividades.cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Practicasmias {
    public static void main(String[] args) {
        /*
         * Actividad 17: Programa que lee una frase desde el teclado y la muestra quitando la última palabra usando solo el metodo main */
         
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce una frase y te la mostraré quitando la última palabra");
        String frase = escaner.nextLine();

        String fraseSinUltimaPalabra = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                fraseSinUltimaPalabra = frase.substring(0, i);
            }
        }
        System.out.println(fraseSinUltimaPalabra);
             
        
        //Coger una cadena y poner la primera letra de cada palabra en mayúsculas.

        System.out.println("Ingresa una frase y convertiré la primera palabra en MAYUS");
        String frase1 = escaner.nextLine();
        
        System.out.print(Character.toUpperCase(frase1.charAt(0)));
        for (int i = 1; i < frase.length(); i++) {
            
            if (frase1.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(frase1.charAt(i + 1)));
                i++;
            
            } else {
                System.out.print(frase1.charAt(i));
            }
        }

        // Ordenar arrays

        int[] numeros = {5, 6, 1, 2, 9, 5, 4, 7};

        int aux;
        int posMin;

        for (int i = 0; i < numeros.length-1; i++) {
            posMin=i;

            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posMin]) {
                    posMin = j;
                }
            }
            aux = numeros[posMin];
            numeros[posMin] = numeros[i];
            numeros[i] = aux;
        }

        System.out.println("\n"+Arrays.toString(numeros));
        

        // Ordenación de arrays bidimensionales.

        String[][] sueldos = {{"Pedro", "1200"},{"Manu", "1500"},{"Luis", "1000"},{"Juan", "1700"} };

        String[] auxx = new String[2];
        int posMinn;

        for (int i = 0; i < sueldos.length-1; i++) {
            
            posMinn=i;

            for (int j = i +1; j < sueldos.length; j++) {
                
                if (Integer.parseInt(sueldos[j][1]) < Integer.parseInt(sueldos[posMinn][1])) {
                    posMinn = j;
                }
            }
            
            auxx = sueldos[posMinn];
            sueldos[posMinn] = sueldos[i];
            sueldos[i] = auxx;
            
        }
        System.out.println("\nArray ordenado por sueldos: ");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i][0] + " " + sueldos[i][1]);
        }
    }
}
