package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		Cilindro cilindro1 = new Cilindro();
		
		System.out.println("*** MÁQUINA CILINDRO***");
		System.out.println("Ingresa la altura del Cilindro1:");
		cilindro1.setAltura(escaner.nextInt());
		
		System.out.println("Ingresa el radio del Cilindro1");
		cilindro1.setRadio(escaner.nextInt());
		
		System.out.println("El área del cilindro1 es: " + cilindro1.getArea() + "metros cuadrados."
		+ " El volumen del cilindro1 es: " + cilindro1.getVolumen() + "metros cúbicos");
		
		
		
		System.out.println("\nIngresa la altura del Cilindro2:");
		int radio = escaner.nextInt();
		
		System.out.println("Ingresa la altura del Cilindro2:");
		int altura = escaner.nextInt();
		
		Cilindro cilindro2 = new Cilindro(radio, altura);
		
		System.out.println("\nEl área del cilindro2 es: " + cilindro2.getArea() + "metros cuadrados."
				+ " El volumen del cilindro2 es: " + cilindro2.getVolumen() + "metros cúbicos");
		
		System.out.println("Los datos del cilindro dos son: ");
		System.out.println(cilindro2.toString());
		
		escaner.close();
	}

}
