package ejemplo05Interfaces;

public class Rectangulo implements Figura2D, Mostrable {

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double area() {
		
		return base * altura;
	}
	
	@Override
	public double perimetro() {
		
		return 2*base + 2*altura;	
	}
	
	@Override
	public void mostrar() {
		System.out.println("Rectángulo de base: " + base + " y altura: " + altura + ".");
		
	}
}
