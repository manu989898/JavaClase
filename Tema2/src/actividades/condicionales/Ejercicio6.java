package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * Crea una aplicación que pregunte el precio de un producto y el número de
		 * unidades compradas. Si el coste de la compra es mayor de 75 €, se le hará un
		 * 15% de descuento. En caso contrario, se le hará sólo un 5% de descuento.
		 */
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Que precio tiene el producto?");
		float precio = escaner.nextFloat();
		
		System.out.println("Cuantas unidades quieres?");
		int unidades = escaner.nextInt();
		float coste = (precio*unidades);
		float costeDescuento = (coste*15)/100;
		if (coste > 75) {
			System.out.println("El precio total es de: " + (coste-costeDescuento) + "euros");
		} else {
			System.out.println("El precio total es de: " + (coste-(coste*5/100)) + "euros.");
		}
		escaner.close();
	}

}
