package Ejemplos;

public class Ejemplo4 {

	public static void main(String[] args) {
		
		System.out.println("El doble de 15 es: " + doblar(15));
		
		int doble = doblar(20);
		
		System.out.println("El doble de 20 es: " + doble);
		
		
	}
	
	// El método doblar recibe un argumento, num, de tipo entero
	// Devuelve el doble de num.
	static int doblar(int num) {
		
		// Al poner return devolvemos el resultado de la operación
		return 2*num;
	}

}
