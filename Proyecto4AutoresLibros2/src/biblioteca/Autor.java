package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int anioNacimiento;
	
	public Autor() {
		
	}

	public Autor(String nombre, String email, int anioNacimiento) {
		
		this.nombre = nombre;
		this.email = email;
		this.anioNacimiento = anioNacimiento;
	}

	public Autor(String nombre) {
		
		this.nombre = nombre;
		this.email = "Unknown";
		this.anioNacimiento = 0;
	}

	public String toString() {
		
		return "Nombre: " + nombre + ", email: " + email + ", año de nacimiento: " + anioNacimiento;
	}
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAnioNacimiento() {
		return anioNacimiento;
	}



	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	
	
	
	
}
