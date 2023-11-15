package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio anterior de manera que si la compra es inferior a 5 €,
		 * se sumen 2 euros a la factura por gastos de gestión.
		 */
		Scanner escaner = new Scanner(System.in);

		System.out.println("Escribe el precio del producto");
		float precio = escaner.nextFloat();

		if (precio < 5) {

			System.out.println("El precio final es de: " + (precio + 2)
					+ "\nDebido a que se aplica un incremento de 2 eur \nal no superar los 5 eur.");
		} else {
			System.out.println("El precio final es de: " + precio + "eur");
		}
		escaner.close();
		
	}
}