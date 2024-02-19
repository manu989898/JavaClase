package cosas;

public class Persona {

	int edad;
	String nombre;
	int anyoNacimiento;
	
	public Persona(int edad, String nombre, int anyoNacimiento) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public Persona() {
		
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
}
