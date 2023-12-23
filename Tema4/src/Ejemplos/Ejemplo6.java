package Ejemplos;

public class Ejemplo6 {

	public static void main(String[] args) {
		
		// Metodo que se llame tablaMultriplicar y mostrará la tabla d emultiplicar del número que le pasemos
		System.out.println("Tabla de multiplicar del 5: ");
		tablaMultiplicar(5);
	}
	
	static void tablaMultiplicar(int num) {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
}
