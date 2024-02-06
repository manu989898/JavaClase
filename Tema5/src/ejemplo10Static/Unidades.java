package ejemplo10Static;

public class Unidades {

	static double PI = 3.151593;

	// Los siguientes atributos son estáticos, eos hace que tengan elmismo valos
	// para cualquier
	// objeto de la clase Unidades.

	// Factor de conversión de quilómetros a metros.
	static double quilometros = 1000;

	// Factor de conversión de centilitros a litros.
	static double centilitros = 0.01;

	public int edad;

	
	
	
	
	
	
	
	public void setEdad(int edad) {
		if (edad >= 18) {

			this.edad = edad;

		} else {
			throw new java.lang.ArithmeticException("Nen que es menor");
		}
	}

}
