package ejemplo05Coche;

public class Main {

	public static void main(String[] args) {
		
		
		Coche coche1 = new Coche("3398JCC", "BMW", "E34 525", "A/C no funciona", 54999);
		Coche coche2 = new Coche("5647LMJ", "Fiat", "Punto");
		
		coche1.mostrar();
		coche2.mostrar();
		
	}
}
