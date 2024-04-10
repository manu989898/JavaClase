package ejemplo05Interfaces;

public class Main {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(10);
		
		Rectangulo r1 = new Rectangulo(5,7);
		
		// Se puede crear una figura que apunta a un objeto que tienga la interfaz Figura2D implementada.
		Figura2D figura1 = c1;
		Figura2D figura2 = r1;
		
		// Se puede llamar a métodos de circulo desde el objeto Figura2D porque está apuntando a un objeto Circulo.
		// El método también tiene que estar en la interfaz Figura2D o hacer un (cast).
		System.out.println("Área de la figura 1: " + figura1.area());
		
		Figura2D figura3 = new Circulo(30);
		Figura2D figura4 = new Rectangulo(100,50);
		
		// Podremos almacenar cualquiera que tenga implement de la interfaz Figura2D.
		Figura2D[] figuras = new Figura2D[10];
		
		figuras[0] = c1;
		figuras[1] = r1;
	}
	
	// Le podriamos pasar cualquier objeto que implemente la interfaz Figura2D.
	public static void anyadir(Figura2D figura) {
	
		
	}
	
}
