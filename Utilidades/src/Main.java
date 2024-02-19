
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nEscribe tu altura, en metros:");
		System.out.println("Tu altura es " + Consola.leerDouble("¡Tu altura debe ser un número!") + " metros");
		
		System.out.println("Escribe tu altura, en metros:");
		System.out.println("Tu altura es: "+ Consola.leerDouble() +  " metros");
		
		System.out.println("\n¿Como te llamas?");
		System.out.println("Te llamas " + Consola.leerString()  +  ".");
	}

}
