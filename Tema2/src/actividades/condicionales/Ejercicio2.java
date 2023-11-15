package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pregunte el precio de un producto. Si vale más de 80
		 * €, le hará un descuento del 10%. Se mostrará en pantalla el precio final.
		 */
		Scanner escaner = new Scanner(System.in);

		System.out.println("Escribe el precio del producto");
		float precio = escaner.nextFloat();

		if (precio > 80) {

			float precioDescuento = precio * 10 / 100;
			float precioFinal = precio - precioDescuento;
			System.out.println("El precio final es de: " + precioFinal
					+ "\nDebido a que se aplica un descuento\nal superar los 80 eur del 10%.");
		}
		System.out.println("El precio final es de: " + precio + "eur");
		escaner.close();
	}
}
