package ejemplo09CocheGetters;

public class Main {

	public static void main(String[] args) {
		
		
		Coche coche1 = new Coche("3398JCC", "BMW", "E34 525", "A/C no funciona", 54999);
		Coche coche2 = new Coche("5647LMJ", "Fiat", "Punto");

		coche1.mostrar();
		coche2.mostrar();
		
		coche2.setAveria("Ruido al acelerar");
		coche2.setQuilometros(24001);

		coche2.mostrar();
		
		// Hemos puesto en el setter una restricción para que solo se guarden valores positivos
		// En este caso no varian los km al ser un número negativo.
		coche2.setQuilometros(-1000);
		coche2.mostrar();
	}
}
