package Ejemplos;

public class Ejemplo5 {

	public static void main(String[] args) {
		System.out.println("Sumando 12 y 15: ");
		sumar(12,15);
		int resultado = sumar(15,12);
		System.out.println("El resultado es: " + resultado);
	}
	
	// El método sumar(), recibe 2 argumentos, a y b, de tipo entero.
	// Muestra la suma de ambos números.
	// No devuelve nada.
	static int sumar(int a, int b) {
		
		return a+b;

	}
}
