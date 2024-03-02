package ejemplo08persona;

public class Persona {

	// Propiedades o atributos de la clase.
	private String apellidos;
	private String nombre;
	private String dni;
	private String fechaNacimiento;

	// METÓDOS.

	// Constructor implícito de la clase.
	public Persona() {

	}

	// Constructor explícito. Nos permite pasarle argumentos.
	// this se refiere al objeto que estamos creando.
	// this.apellidos se refiere al atributo apellidos, por ejemplo.
	public Persona(String apellidos, String nombre, String dni, String fechaNacimiento) {

		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;

	}
	
	// Constructor con solo apellidos y nombre
	public Persona(String apellidos, String nombre) {
		
		this.apellidos = apellidos;
		this.nombre = nombre;
		// Damos un valor por defecto al atributo dni.
		this.dni = "Sin DNI";
		// Dejamos el atributo fechaNacimiento con el valor por defecto, null.
		
		/* una manera de simplificarlo mas seria escribir
		 
		 * this(apellidos, nombre, "Sin DNI", null);
		 
		 */
	}
	
	// Constructor explícito. Le pasamos el dni y dejamos el resto de atirbutos con valor null.
	public Persona(String dni){
		
		this.dni = dni;
		
		// this(null, null, dni, null);  Es lo mismo que poner this.dni = dni;
	}

	// Muestra en la terminal todos los valores de los atributos.
	public void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene.
	public boolean tieneDni() {
		if (dni == null || dni.equals("Sin DNI")) {
			return true;
		}
		return false;
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa).
	public String anyoNacimiento() {
		if (fechaNacimiento == null) {
			return null;
		}
		return fechaNacimiento.substring(6);
	}

	// GETERS Y SETERS
	
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
}