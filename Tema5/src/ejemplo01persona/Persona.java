package ejemplo01persona;

import java.util.Iterator;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;
	
	/* //    ****   CONSTRUCTOR   ***
	
	// Constructor explícito. Le pasamos los apellidos y el nombre 
	// y dejamos los otros datos con valores por defecto.
	Persona(String apellidos, String nombre){
		this.apellidos = apellidos;
		this.nombre = nombre;	
		// Damos un valor por defecto a DNI ya que no se lo damos en el ()
		this.dni = "Sin DNI";	
		// Dejamos el atributo fechaNacimiento por defecto, null.
	}
	
	*/
	
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
