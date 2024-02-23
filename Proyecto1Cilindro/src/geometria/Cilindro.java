package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final double PI = 3.141592;
	
	public Cilindro(){
		
	}
	
	public Cilindro(int altura, int radio){
		this.altura = altura;
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	//TODO
	public double getArea() {
		return 2* PI * radio *(radio + altura);
	}
	
	//TODO
	public double getVolumen() {
		return PI * Math.pow(radio, 2) * altura;
	}
	
	public String toString() {
		
		String datos = "La altura del cilindro es: " + altura + ". El radio es: " + radio;
		return datos;
	}
}
