package ejemplo02Vehiculo;

public abstract class Vehiculo {

	private String matricula;
	private int capacidad;
	private double peso;
	private String marca;
	private String modelo;
	private int potencia;

	public Vehiculo(String matricula, int capacidad, double peso, String marca, String modelo, int potencia) {
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.peso = peso;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		
		return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
		
	}
	
	public abstract void Matricular();

}