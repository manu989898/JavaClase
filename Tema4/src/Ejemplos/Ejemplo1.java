package Ejemplos;

public class Ejemplo1 {

	/*
	 * Subrrutina: Trozo de código que se le pone un nombre y se puede llamar desde cualquier parte del programa.
	 * 		       Cuando termina de ejecutarse el programa continua por la siguiente línea de código.
	 * Procedimiento: Subrutina que no devuelve nada. Puede tomar parametros.
	 * Función: Subrutina que devuelve un valor. Puede tomar parametros.
	 * Método: Proceidmiento o función que pertenece a una clase.
	 */


	public static void main(String[] args) {
		
		System.out.println("Llamando al mayordomo.");
		
		// Llamamos al método mayordomo.
		mayordomo();
		
		System.out.println("Traigame unos turrones");
		
	}
	
	// Definimos el método mayordomo().
	// Este método no devuelve nada y no toma ningún argumento.
	static void mayordomo() {
		
		System.out.println("¿Que desea, señor?");
		
	}
}
