package actividades;

import java.util.Scanner;

public class actividad5 {

	public static void main(String[] args) {

		/*
		 Crea un programa que pida el nombre de un producto en venta, 
		 su precio y el descuento que se le debe hacer. 
		 Mostrará todos los datos junto al precio rebajado
		 */
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce nombre de articulo");
		
		String nombreArticulo = escaner.nextLine();
		System.out.println("Introduce precio del articulo");
		int precio = escaner.nextInt();
		
		System.out.println("Introduce el porcentaje de descuento");
		int descuento = escaner.nextInt();
		
		
		float precioDescuento = (precio * descuento/100);
		float precioFinal = (precio - precioDescuento);
		System.out.println("El precio final es: " + precioFinal + " euros");
	}

}
