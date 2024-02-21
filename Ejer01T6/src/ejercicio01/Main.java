package ejercicio01;

public class Main {

	public static void main(String[] args) {
		
		Mp3 mp1 = new Mp3("Walking on sun shine", 2, "Pedro","no se", 2);
	
		Ogg o1 = new Ogg("Carmen", 431, "Bizet", "Ópera", 3);
		
		Medio m1 = mp1;
		
		mp1.reproducir();
		System.out.println(mp1.guardar());
		
		m1.reproducir();
		System.out.println(((Mp3)m1).guardar());
		
		Guardable g1 = o1;
	}

}
