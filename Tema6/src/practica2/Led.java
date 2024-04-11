package practica2;

public class Led extends Diodo {

	private String color;

	public Led(double intensidadMaxima, double longitud, double tensionInversa, String color) {
		super(intensidadMaxima, longitud, tensionInversa);
		this.color = color;
	}

}
