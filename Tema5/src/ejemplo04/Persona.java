package ejemplo04;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// METÓDOS.

	// Constructor implícito de la clase.
	Persona() {

	}

	// Constructor explícito. Nos permite pasarle argumentos.
	// this se refiere al objeto que estamos creando.
	// this.apellidos se refiere al atributo apellidos, por ejemplo.
	Persona(String apellidos, String nombre, String dni, String fechaNacimiento) {

		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;

	}
	
	Persona(String apellidos, String nombre) {
		
		this.apellidos = apellidos;
		this.nombre = nombre;
		// Damos un valor por defecto al atributo dni.
		this.dni = "Sin DNI";
		// Dejamos el atributo fechaNacimiento con el valor por defecto, null.
		
	}
	
	// Constructor explícito. Le pasamos el dni y dejamos el resto de atirbutos con valor null.
	Persona(String dni){
		this.dni = dni;
	}

	// Muestra en la terminal todos los valores de los atributos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene.
	boolean tieneDni() {
		if (dni == null || dni.equals("Sin DNI")) {
			return true;
		}
		return false;
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa).
	String anyoNacimiento() {
		if (fechaNacimiento == null) {
			return null;
		}
		return fechaNacimiento.substring(6);
	}

}