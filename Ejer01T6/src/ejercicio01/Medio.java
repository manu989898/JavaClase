package ejercicio01;

public abstract class Medio {
	
	private String nombre;
	private double duracion;

	public abstract void reproducir();
	
	public Medio(String nombre, double duracion) {
		
		this.nombre = nombre;
		this.duracion = duracion;
	}
		
}
