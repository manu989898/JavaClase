package ejemplo06Excepciones;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();
		int num;
		
		//Colocamos en un bloque try instrucciones que pueden lanzar un error. 
		try {
			
			//La siguiente instrucción puede lanzar un error (FormatExceprion) en función de lo que escribamos.
			num = Integer.parseInt(numero);
			
			//La siguiente instrucción puede lanzar un error (ArithmeticExceprion) si ponemos 0.
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			
			
		//Con catch recogemos las excepciones si se han producido.
			//En este caso recogerá una excepcion de tipo NumberFormatException.
		}catch (NumberFormatException nfe) {
			
			System.out.println("¡Tienes que poner un número entero!");
			System.out.println(nfe.getMessage());
	
		}catch (ArithmeticException ae) {
			
			System.out.println("¡No se puede dividir entre 0!");
		
		}catch (Exception e) {
			
			System.out.println("Se ha producido un error inesperado, el programa se cerrará");
		}
		
		
		
	}
}
