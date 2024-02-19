package com.carlos.apruebame;

public class Main {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion("Son Ferrer", "Calle Cóndor", "9", "Planta Baja");
		Direccion d2 = new Direccion("El Toro", "Calle Mayor", "18", "Piso 1B");
		
		
		Paquete p1 = new Paquete(1,"Carlos Sogorb", d1);
		Paquete p2 = new Paquete(2,"Manuel Cuesta", d2);
		
		System.out.println(p1.toString());
		
		Camion c1 = new Camion(2);
		
		System.out.println("\nmostrando paquetes sin añadir ninguno");
		c1.showPaquetes();
		
		System.out.println("\nAñadiendo paquetes...");
		c1.addPaquete(p1);
		c1.addPaquete(p2);
		
		System.out.println("\nMostrando paquetes con paquetes");
		c1.showPaquetes();
		
		System.out.println("\nEliminando p2...");
		c1.delPaquetes(2);
		
		System.out.println("Mostrando paquetes despues de eliminar");
		c1.showPaquetes();
		
		System.out.println("\nMostrando paquetes por Son Ferrer");
		c1.showPaquetes("Son Ferrer");
		
	
	}

}
