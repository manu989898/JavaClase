package ejemplo01persona;

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
		System.out.println("Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni);
	}
}
