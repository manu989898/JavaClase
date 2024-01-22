package Ejemplos;

import java.util.Arrays;
import java.util.Iterator;

public class Ejemplo12 {

	public static void main(String[] args) {
		// Programa de consola que va a recibir 5 datos y los va a mostrar la mediana de esos datos.
		
		System.out.println(Arrays.toString(args));
		
		// Creamos un array de enteros con los mismos valores leidos de la temrinal
		
		int[] numeros = new int[5];
		
		for (int i = 0; i< numeros.length; i++) {
			
			numeros[i] = Integer.parseInt(args[i]);
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println("Mediana : " + mediana(numeros));
	}
	
	// Devuelve la mediana de un array de números que ha recibido como argumento
	static int mediana(int[] numeros) {
		
		ordenar(numeros);
		
		if (numeros.length % 2 == 0) {
			
			return (numeros[numeros.length / 2] + numeros[numeros.length / 2 -1]) / 2;
		}
		
		return (numeros[(numeros.length / 2)]);
	}	
	
	// Ordena un array de números ordenado que ha recibido com argumento
	static void ordenar(int[] numeros) {
		
		int posMin;
		int aux;
		
		for(int i = 0; i < numeros.length - 1; i++) {
			posMin = i;
			
			for(int j = i+1; j < numeros.length; j++) {
				
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}
	}
}
