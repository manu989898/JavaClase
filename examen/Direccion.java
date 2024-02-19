package com.carlos.apruebame;

public class Direccion {
	private String ciudad;
	private String calle;
	private String numero;
	private String puerta;
	
	
	public Direccion(String ciudad, String calle, String numero, String puerta) {
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.puerta = puerta;
	}


	@Override
	public String toString() {
		return calle + ", " + numero + ", " + puerta + ", " + ciudad;
	}


	public String getCiudad() {
		return ciudad;
	}
	
	
	
	
}
