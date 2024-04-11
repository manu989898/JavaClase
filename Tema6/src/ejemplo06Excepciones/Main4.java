package ejemplo06Excepciones;

import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) {

		try {
			
			dividirPor20();
			
		} catch (NumberFormatException | ArithmeticException e) {

			System.out.println("¡Tienes que poner un número entero y que no sea 0!");
			//System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println("Se ha producido un error inesperado, el programa se cerrará");

		} finally {

		}

	}
	
	// Al poner throws en el método estamos pasandole el trabajo de gestionar las excepciones al método que lo llame, en este caos el Main.
	static void dividirPor20() throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		int num;

		num = Integer.parseInt(numero);

		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}
}
