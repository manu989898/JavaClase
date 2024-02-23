package project;

public class Motor {
	
	private int id;
	private String fabricante;
	private String modelo;
	
	
	
	public Motor(int id, String fabricante, String modelo) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public Motor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
