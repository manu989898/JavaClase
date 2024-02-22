package practica2;

import java.util.Scanner;

public class Diodo extends Componente {
	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");
	}

	public void leeDatos() {

		try {

			Scanner entrada = new Scanner(System.in);

			System.out.println("Introduce la Tensión inversa:");
			double tensionInversa = entrada.nextDouble();

			System.out.println("Introduce la intensidad máxima:");
			double intensidadMax = entrada.nextDouble();
			

			System.out.println("Introduce la longitud:");
			double longitud = entrada.nextDouble();
			
			this.tensionInversa = tensionInversa;
			setIntensidadMaxima(intensidadMax);
			setLongitud(longitud);

		} catch (NumberFormatException fe) {

			System.out.println("Entrada Incorrecta");
			
		} catch (Exception e) {

			e.printStackTrace();
			return;
			
		} finally {
			System.out.println("Fin de la lectura de datos.");
		}
	}

	public double getTensionInversa() {
		return tensionInversa;
	}

	public void setTensionInversa(double tensionInversa) {
		this.tensionInversa = tensionInversa;
	}

}
