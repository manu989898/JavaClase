package ejemplo02Coche;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		
		//Damos valores a coche.
		coche1.matricula = "3398JCV";
		coche1.marca = "BMW";	
		coche1.modelo = "E30 525";
		coche1.averia = "AC no funciona";
		coche1.quilometros = 54_298;
		
		Coche coche2 = new Coche();
		
		coche2.leeDatos();
		
	}

}
