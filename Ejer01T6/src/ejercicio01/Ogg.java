package ejercicio01;

public class Ogg extends Musica implements Guardable{
	
	private int version;
	
	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

}
