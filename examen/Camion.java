package com.carlos.apruebame;

public class Camion {
	
	private int numPaquetes;
	private Paquete[] paquetes;
	
	public Camion(int capacidad) {
		
		this.numPaquetes = 0;
		this.paquetes = new Paquete[capacidad];
		
	}
	
	public void addPaquete(Paquete paquete) {
		if (numPaquetes < paquetes.length) {
		paquetes[numPaquetes] = paquete;
		numPaquetes ++;
		// Prueba del valor de numPaquetes al añadir uno.
		// System.out.println(numPaquetes);
		}
	}
	
	public void showPaquetes() {
		System.out.println("Carga del camión:");
		
		for (int i = 0; i < numPaquetes; i++) {
			if(paquetes[i] != null) {
			System.out.println(paquetes[i].toString());
			}
		}
	}
	
	public void delPaquetes(int codPaquete) {
		
		int buscPaq = searchPaquete(codPaquete);
		if(buscPaq != -1) {
			paquetes[buscPaq] = null;
			for (int i = buscPaq +1; i < numPaquetes; i++) {
				if(paquetes[buscPaq + 1] !=null) {
					paquetes[buscPaq] = paquetes[buscPaq+1];
					buscPaq ++;
				}
			}
		}
		
		
		numPaquetes --;
		// Prueba del valor de numPaquetes al eleimninar uno. 
		//System.out.println(numPaquetes);
	}
	
	public void showPaquetes(String ciudad) {
		
		for (int i = 0; i < numPaquetes; i++) {
			if(paquetes[i] != null && paquetes[i].getDireccion().getCiudad().equals(ciudad)) {
				System.out.println(paquetes[i].toString());
			}
		}
	}
	public int searchPaquete(int codPaquete) {
		
		for (int i = 0; i <= numPaquetes; i++) {
			if(paquetes[i].getCodigo() == codPaquete) {
				return i;
			}
		}
		
		return-1;
	}
}
