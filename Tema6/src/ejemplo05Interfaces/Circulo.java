package ejemplo05Interfaces;

public class Circulo implements Figura2D {
	
	private int radio;

	@Override
	public double area() {
	
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
	
		return 2* Math.PI * radio;
	}

}
