package ejemplo01persona;

// Al poner abstracte hacemo que no se puedan crear objetos de tipo persona.
public abstract class Persona {
	
	// Protected tiene rango de hijas y paquete.
	private String apellidos;
	private String nombre;
	private String dni;
	
	public Persona() {
		
	}
		
	public Persona(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	// Hacemos este método abstracto. no le ponemos contenido y obligamos a que las clases hijas
	// lo implementen.
	public abstract void mostrar() ;

	
	
	
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}

