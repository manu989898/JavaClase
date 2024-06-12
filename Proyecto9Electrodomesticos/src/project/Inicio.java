package project;

public class Inicio {

	public static void main(String[] args) {
		Taller taller1 = new Taller();
		Motor motor1 = new Motor(1,"Bosch", "LaquetelavaV3");
		
		Lavadora lava1 = new Lavadora(1,motor1, "Bosch", 411);
		Lavadora lava2 = new Lavadora(2,motor1, "Hyundai", 491);
		
		System.out.println("\nAñadiendo lavadoras...");
		taller1.addLavadora(lava1);
		taller1.addLavadora(lava2);
		syso
		System.out.println("\nMostrando lavadoras");
		taller1.listaLavadoras();
		
		System.out.println("\nBorrando lavadora id: 1 ...");
		taller1.borraLavadora(1);
		
		System.out.println("\nMostrando lavadoras");
		taller1.listaLavadoras();
		
	}
}
