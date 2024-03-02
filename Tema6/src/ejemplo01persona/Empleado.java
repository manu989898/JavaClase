package ejemplo01persona;

public class Empleado extends Persona{
	
	private String empleadoId;
	
	public Empleado(String apellidos, String nombre, String dni, String empleadoId) {
		
		super(apellidos, nombre, dni);
		
		this.empleadoId = empleadoId;
	}
	
	@Override
	public void mostrar() {
		
		System.out.println("\n" + getNombre() + " " + getApellidos() + " " + ", con Dni" + getDni() + ".");
		System.out.println(", ID: " + empleadoId);
	}

}
