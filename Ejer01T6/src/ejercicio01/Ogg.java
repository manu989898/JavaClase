package ejercicio01;

public class Ogg extends Musica implements Guardable{
	
	private int version;
	
	public Ogg(String nombre, double duracion, String artista, String estilo, int version) {
		super(nombre, duracion, artista, estilo);
		this.version = version;
	}


	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

}
