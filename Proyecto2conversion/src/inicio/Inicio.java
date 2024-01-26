package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduce la distancia en km y se te devolverá en millas");
		double km = escaner.nextDouble();
		System.out.println("\nLa distancia en millas es " + Conversor.millas(km));
		
		System.out.println("\nIntroduce una presión en mb y se te devolverá en atmósferas:");
		double milibares = escaner.nextDouble();
		System.out.println(milibares + " milibares en atmósferas son: " + Conversor.atmosferas(milibares));
		
		System.out.println("\nIngresa una cantidad en calorías y se te devolverá en julios");
		double calorias = escaner.nextDouble();
		System.out.println("\n" + calorias + " calorias son: " + Conversor.julios(calorias)+ " julios");
	}

}
