package ejercicio01;

public class Mp3 extends Musica implements Guardable {
	
	private int modo;
		
	public Mp3(String nombre, double duracion, String artista, String estilo, int modo) {
		super(nombre, duracion, artista, estilo);
		this.modo = modo;
	}

	
	@Override
	public boolean guardar() {
		
		
		return true;
	}

}
