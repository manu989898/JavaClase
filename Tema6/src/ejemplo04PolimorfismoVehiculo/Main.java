package ejemplo04PolimorfismoVehiculo;

public class Main {

	
	public static void main(String[] args) {
				
		Vehiculo vehiculo1 = new Vehiculo("2034JHH", 5, 1000, "Seat", "Toledo",115);
		
		Coche coche1 = new Coche("9121DES",5,1200,"Volkswagen","Golf", 130, 5);
		
		Moto moto1 = new Moto("1234ABC",2,150,"Yamaha","R6", 96, true);
		
		// Guardamos en vehiculo2 un objeto Coche ya que cualquier coche es un vehiculo.
		Vehiculo vehiculo2 = coche1;
		
		// Guardamos en coche2 un objeto Coche que está dentro de una variable Vehiculo.
		Coche coche2 = (Coche) vehiculo2;

	}
}