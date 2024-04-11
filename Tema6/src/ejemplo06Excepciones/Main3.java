package ejemplo06Excepciones;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();
		int num;
		
		try {
			num = Integer.parseInt(numero);
			
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			
			// Se pueden juntar varias excepciones usando "|".
		}catch (NumberFormatException | ArithmeticException e) {
			
			System.out.println("¡Tienes que poner un número entero!");
			System.out.println(e.getMessage());
	
		}catch (Exception e) {
			
			System.out.println("Se ha producido un error inesperado, el programa se cerrará");
		
		} finally {
			
		}
		
		
		
	}
}
