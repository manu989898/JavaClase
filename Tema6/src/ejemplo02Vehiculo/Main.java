package ejemplo02Vehiculo;

public class Main {

	
	public static void main(String[] args) {
				
		Coche coche1 = new Coche("9121DES",5,1200,"Volkswagen","Golf", 130, 5);
		
		System.out.println("\n" + coche1.toString());
		
		Moto moto1 = new Moto("1234ABC",2,150,"Yamaha","R6", 96, true);
		
		System.out.println("\n" + moto1.toString());
		
	}
}