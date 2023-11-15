package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida la temperatura de un reactor nuclear. Si ésta
		 * supera los 120ºC, se mostrará en pantalla el mensaje: "TEMPERATURA DEL
		 * REACTOR CRÍTICA. ¡CORRED, INSENSATOS!
		 */
		Scanner escaner = new Scanner(System.in);

		System.out.println("Escribe la temperatura del reactor");
		float temperaturaActual = escaner.nextFloat();

		if (temperaturaActual > 120) {
			System.out.println(": \"TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
		}
		System.out.println("Temperatura dentro de los valores seguros");
		escaner.close();
	}

}
