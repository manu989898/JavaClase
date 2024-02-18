package ejemplo03PolimorfismoPersona;


public class Persona {
	
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

public void mostrar() {
		
		System.out.println("\n" + getNombre() + " " + getApellidos() + " " + ", con Dni" + getDni() + ".");
}
	
	// Getters y Setters.
	
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

