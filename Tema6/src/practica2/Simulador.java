package practica2;

public class Simulador {
	
	public static void main(String[] args) {
		
		Diodo di1 = new Diodo(2.2, 0.2, 14);
		
		Led l1 = new Led(2.1, 0.3, 12, "verde");
		
		Condensador con1 = new Condensador(1.2, 0.3, 3);
		
		Componente co1 = di1;
		
		di1 = l1;
		
	}
	
}
