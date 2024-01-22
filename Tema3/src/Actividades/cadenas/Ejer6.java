package Actividades.cadenas;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {

        /*
         * Programa que pide una frase y dos letras. A continuación muestra la frase
         * sustituyendo la primera letra por la segunda.
         */
/*
        Scanner escaner = new Scanner(System.in);

        String frase;
        String letra1;
        String letra2;

        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();

        System.out.println("Introduce la letra que quieres sustituir: ");
        letra1 = escaner.nextLine();

        System.out.println("Introduce la letra por la cual se va a sustituir: ");
        letra2 = escaner.nextLine();

        frase = frase.replace(letra1.charAt(0), letra2.charAt(0));
        System.out.println(frase);
        
        escaner.close();
        */
    	
    	String[][] sueldos = {{"Pedro", "1300"},{"Luis", "1360"},{"Jose", "1400"},{"Manu", "1320"}};
    	String[] aux;
    	int posMin;
    	
    	for (int i = 0; i < sueldos.length -1; i++) {
			posMin = i;
			
			for (int j = i +1; j < sueldos.length; j++) {
				
				if (Integer.parseInt(sueldos[j][1])<Integer.parseInt(sueldos[posMin][1])) {
					posMin = j;
				}
			}
			
			aux = sueldos[posMin];
			sueldos[posMin] = sueldos[i];
			sueldos[i] = aux;
			
			
		}
    	System.out.printf("\n%-7s %-7s" , "Nombres" ,"Sueldos");
    	System.out.printf("\n%-7s %-7s" , "=======" , "=======");
    	for (int i = 0; i < sueldos.length; i++) {
    		System.out.printf("\n%-7s %-4s", sueldos[i][0] ,sueldos[i][1]);
		}
    }
}



