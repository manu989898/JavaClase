import java.util.Scanner;

public class Consola {
	private static Scanner entrada = new Scanner(System.in);

	// Lee un número entero desde la terminal. Si lo que se introduce no es un
	// entero, muestra el mensaje de error que se le ha pasado como parámetro.

	public static int leerInt(String mensajeError) {
		
		while (!entrada.hasNextInt()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}

		int num = entrada.nextInt();
		entrada.nextLine();
		return num;
	}

	// Lee un número entero desde la terminal. Si lo que se introduce no es un
	// entero, muestra un mensaje de error.
	public static int leerInt() {
		
		return leerInt("Entrada incorrecta: se esperaba un número entero.");
	}

	
	// **********  PARTE PRÁCTICA 3B  ***********
	
	
	public static double leerDouble(String mensajeError) {
		
		while (!entrada.hasNextDouble()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}
		double num = entrada.nextDouble();
		entrada.nextLine();
		return num;
	}
	
	public static double leerDouble() {
		
		return leerDouble("Entrada incorrecta: se esperaba un número.");
	}
		
	public static String leerString() {
		String cadena = entrada.nextLine();
		return cadena;
		
	}
}