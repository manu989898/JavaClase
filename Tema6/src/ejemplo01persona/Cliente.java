package ejemplo01persona;

public class Cliente extends Persona {

	private String visa;
	
	public Cliente(String apellidos, String nombre, String dni, String visa) {
		
		// Ponemnos super para pasar los datos del constructor padre (Persona).
		super(apellidos,nombre,dni);
		
		// Añadimos los atributos que no están en la clase padre (Persona).
		this.visa = visa;
		
	}
	
	public void mostrar() {
		
		// Llamamos al método mostrar de la clase padre ya que sus atributos son privados.
		super.mostrar();
		
		// Añadimos el atributo extra de Cliente.
		System.out.print(", visa: " + visa);
	}
	
}
