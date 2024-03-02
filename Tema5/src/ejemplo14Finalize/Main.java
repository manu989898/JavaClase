package ejemplo14Finalize;

public class Main {

	public static void main(String[] args) {

		for (long i = 0; i < 1000000000000000000l; i++) {
			Coche coche = new Coche("2345FCC", "Seat", "ibiza");
			coche = null;
		}
		System.out.println("Fin");
		
	}

}
