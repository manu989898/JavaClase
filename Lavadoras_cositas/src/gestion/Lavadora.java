package gestion;

public class Lavadora {

	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private static int iva;
	
	public Lavadora(int id, Motor motor, String marca, float precio) {
		super();
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Lavadora: id=" + id + ", motor=" + motor.getFabricante() + ", marca=" + marca + ", precio=" + precio ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
