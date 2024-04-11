package practica2;

public abstract class Componente {
	
	private double intensidadMaxima;
	private double longitud;
	
	public Componente(double intensidadMaxima, double longitud) {
		
		this.intensidadMaxima = intensidadMaxima;
		this.longitud = longitud;
	}
	
	public abstract void conectar();

	public double getIntensidadMaxima() {
		return intensidadMaxima;
	}

	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
}
