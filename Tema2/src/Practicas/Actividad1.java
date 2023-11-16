package Practicas;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		/*
		 * Actividad 1 Escribe un programa que pregunte continuamente la concentración
		 * de aire en una estancia. Dependiendo del valor indicado, responderá con uno
		 * de estos mensajes: •Si el CO2 es mayor o igual a 300 y menor que 700:
		 * "La concentración de CO2 es baja." •Si el CO2 es mayor o igual a 700 y menor
		 * que 900: "La concentración de CO2 es moderada. El aire no se está reciclando
		 * correctamente." •Si el CO2 es mayor o igual a 900: "La concentración de CO2
		 * es demasiado alta. Aire perjudicial para la salud." Todo el proceso se
		 * repetirá mientras la concentración de CO2 introducida sea mayor o igual a
		 * 300.
		 */

		Scanner escaner = new Scanner(System.in);
		double concentracion = 300;

		System.out.println("¿Cual es la concenctración de CO2?");
		concentracion = escaner.nextDouble();

		while (concentracion >= 300) {

			if (concentracion >= 300 && concentracion < 700) {

				System.out.println("La concentración de CO2 es baja.");
				System.out.println("¿Cual es la concenctración de CO2?");
				concentracion = escaner.nextDouble();

			} else if (concentracion >= 700 && concentracion < 900) {

				System.out.println("La concentración de CO2 es moderada");
				System.out.println("¿Cual es la concenctración de CO2?");
				concentracion = escaner.nextDouble();

			} else if (concentracion >= 900) {

				System.out.println("La concentración de CO2 es demasiado alta. Aire\n" + "perjudicial para la salud.");
				System.out.println("¿Cual es la concenctración de CO2?");
				concentracion = escaner.nextDouble();

			} else if (concentracion < 300) {
				System.exit(0);
			}

		}

	}

}
