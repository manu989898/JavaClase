package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pregunte el precio de un producto y el número de
		 * unidades compradas. Si el coste de la compra es menor de 100 €, el cliente no
		 * tiene derecho a un descuento. Si el coste sobrepasa los 200 €, el descuento
		 * será del 15%. De lo contrario será del 10% solamente.
		 */

		Scanner escaner = new Scanner(System.in);
		float precioProducto = 0;
		int cantidad = 0;

		System.out.println("¿Cual es el precio del producto?");
		precioProducto = escaner.nextFloat();

		System.out.println("¿Cuanta cantidad compraste?");
		cantidad = escaner.nextInt();

		float precioSinAplicar = precioProducto * cantidad;

		if (precioSinAplicar < 100 ) {
			System.out.println("El precio total es de: " + precioSinAplicar + "euros.");

		} else if ((precioSinAplicar >100) && (precioSinAplicar <200)){
			System.out.println("El precio total es de: " + (precioSinAplicar-(precioSinAplicar*10)/100) + "euros.");
		} else {
			System.out.println("El precio total es de " + (precioSinAplicar-(precioSinAplicar*15)/100) + "euros.");
		}
		escaner.close();
	}

}
