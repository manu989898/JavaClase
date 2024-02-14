package ejemplo01persona;

import java.util.Iterator;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;


	/*
	 * this en java es una referencia a la instancia actual de la clase.
	 * private: solo se puede acceder desde la propia clase.
	 * public: se puede acceder desde cualquier clase del proyecto.
	 * protected: se puede acceder todo el paquete y las subclases.
	 * default: se puede acceder solo desde el paquete.
	 * static: se puede acceder sin instanciar la clase. y es compartido por todas las instancias.
	 * sobrecarga de métodos: dos métodos con el mismo nombre pero con diferente número o tipo de parámetros.
	 * jar: es un archivo que contiene clases java y recursos comprimidos.
	 * 
	 * procedimiento: no devuelve nada. (void)
	 * función: devuelve un valor. (return)
	 * 
	 * getter: devuelve el valor de un atributo.
	 * 
	 * public String getNombre() {
	 * 	return nombre;
	 * }
	 * 
	 * 
	 * setter: modifica el valor de un atributo.
	 * 
	 * public void setNombre(String nombre) {
	 * 	this.nombre = nombre;
	 * }
	 */
	
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
