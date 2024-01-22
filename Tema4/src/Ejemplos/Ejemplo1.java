package Ejemplos;

public class Ejemplo1 {

	/*
	 * Subrrutina: Trozo de código que se le pone un nombre y se puede llamar desde cualquier parte del programa.
	 * 		       Cuando termina de ejecutarse el programa continua por la siguiente línea de código.
	 * 
	 * Procedimiento: Subrutina que no devuelve nada. Puede tomar parametros.
	 * 
	 * Función: Subrutina que devuelve un valor. Puede tomar parametros.
	 * 
	 * Método: Proceidmiento o función que pertenece a una clase.
	 * 
	 * Paso de parámetros:
	 * 
	 * 		Paso por valor: Se pasa una copia del valor de la variable. (aunque se modifique dentro del método, no se modifica fuera)
	 * 						Se pasa por valor cuando son tipos primitivos: int, double, char, boolean, etc.
	 * 
	 * 		Paso por referencia: Se pasa la dirección de memoria de la variable. (si se modifica dentro del método, se modifica fuera)
	 * 							 La variable parámetro recibe un puntero a la variable original.
	 * 							 Se pasa por referencia cuando son tipos no primitivos: String, arrays, etc.
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
