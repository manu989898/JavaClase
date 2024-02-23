package ejemplo04PolimorfismoVehiculo;

public class Moto extends Vehiculo {

	private boolean baul;

	public Moto(String matricula, int capacidad, double peso, String marca, String modelo, int potencia, boolean baul) {
		super(matricula, capacidad, peso, marca, modelo, potencia);
		this.baul = baul;
	}

	@Override
	public String toString() {

		String tieneBaul = baul ? "Sí" : "No";
		return super.toString() + "\nBaul: " + tieneBaul;

	}

}