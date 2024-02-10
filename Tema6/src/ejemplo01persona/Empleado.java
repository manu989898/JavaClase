package ejemplo01persona;

public class Empleado extends Persona{
	
	private String empleadoId;
	
	public Empleado(String apellidos, String nombre, String dni, String empleadoId) {
		
		super(apellidos, nombre, dni);
		
		this.empleadoId = empleadoId;
	}
	
	public void mostrar() {
		
		super.mostrar();
		System.out.println(", ID: " + empleadoId);
	}

}
