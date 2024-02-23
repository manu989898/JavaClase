package ejemplo02Vehiculo;

// Al hacerla clase final no podrá tener clases hijas.
public final class Moto extends Vehiculo {

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

	@Override
	public void Matricular() {
		
	}

}