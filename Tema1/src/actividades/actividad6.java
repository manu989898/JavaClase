package actividades;

import java.util.Scanner;

public class actividad6 {

	public static void main(String[] args) {

		/*
		 * Escribe una aplicación que pida el nombre de un producto, su precio y el
		 * número de unidades vendidas, y devuelva el coste total de la compra
		 */

		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce nombre de articulo");

		String nombreArticulo = escaner.nextLine();
		System.out.println("Introduce precio del articulo");
		int precio = escaner.nextInt();

		System.out.println("Indica el numero de unidades vendidas");
		int cantidadesVendidas = escaner.nextInt();

		System.out.println("El coste total de la compra es: " + (precio * cantidadesVendidas) + " euros.");

	}

}
