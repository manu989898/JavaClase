package ejemplo03PolimorfismoPersona;

public class Cliente extends Persona {

	private String visa;
	
	public Cliente(String apellidos, String nombre, String dni, String visa) {
		
		// Ponemnos super para pasar los datos del constructor padre (Persona).
		super(apellidos,nombre,dni);
		
		// Añadimos los atributos que no están en la clase padre (Persona).
		this.visa = visa;
		
	}
	
	@Override
	public void mostrar() {
		
		System.out.println("\n" + getNombre() + " " + getApellidos() + " " + ", con Dni" + getDni() + ".");
		
		// Añadimos el atributo extra de Cliente.
		System.out.print("\n, visa: " + visa);
	}
	
}
