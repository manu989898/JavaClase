package ejemplo03PolimorfismoPersona;

public class Directivo extends Empleado {

	private int bonus;

	public Directivo(String apellidos, String nombre, String dni, String empleadoId, int bonus) {
		
		super(apellidos, nombre, dni, empleadoId);
		this.bonus = bonus;

	}
	
	@Override
	public void mostrar() {
		
		System.out.println("\n" + getNombre() + " " + getApellidos() + " " + ", con Dni" + getDni() + ".");
		System.out.println(", ID: " + getEmpleadoId());
		System.out.println(", Bonus: " + bonus);
	}
	
}