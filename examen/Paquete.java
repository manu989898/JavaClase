package com.carlos.apruebame;

public class Paquete {
	private int codigo;
	private String destinatario;
	private Direccion direccion;
	
	public Paquete(int codigo, String destinatario, Direccion direccion) {
		
		this.codigo = codigo;
		this.destinatario = destinatario;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return codigo + ", " + destinatario + "( " + direccion + ")";
	}

	public int getCodigo() {
		return codigo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	
	
	
	
}
