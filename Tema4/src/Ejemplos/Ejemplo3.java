package Ejemplos;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		System.out.println("Sumando 12 y 15: ");
		sumar(12,15);
	}
	
	// El método sumar(), recibe 2 argumentos, a y b, de tipo entero.
	// Muestra la suma de ambos números.
	// No devuelve nada.
	static void sumar(int a, int b) {
		
		System.out.println("La suma es de: "+ (a+b));
	}
}
