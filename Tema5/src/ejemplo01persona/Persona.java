package ejemplo01persona;

import java.util.Iterator;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// Métodos.
	void mostrar() {
		System.out.println("Nombre completo: " + apellidos + " " + nombre);
		System.out.println("DNI :" + dni + " .");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + " .");
	}

	// Un metodo tieneDni() que devuelva true si la perosna tiene DNI y false si no
	// lo tiene.
	boolean tieneDni() {
		if (dni != null) {
			return true;
		}
		return false;
	}
	
	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que el formato sea dd/mm/aaaa).
	
	String anyoNacimiento() {
		if (fechaNacimiento != null) {
			return fechaNacimiento.substring(6);
		}
			return null;	
	}
	
}
