package ejemplo10Static;

public class Main {

	public static void main(String[] args) {
		
		// El atributo PI es static. No es necesario crear un objeto de la clase
		// unidades para luego acceder a PI desde el.
		// Podemos acceder a PI simplemente poniendo el nombre de la clase delante.
		
		// PI.
		System.out.println("El número PI es: " + Unidades.PI);
		
		// Igualmente podemos acceder al atributo estático centilitros 
		// anteponiendo el nombre de la clase.
		// 50cl son ... litros.
		System.out.println("50 cl son: " + Unidades.centilitros * 50);
		
		// Igualmente podemos acceder al atributo estático quilometros 
		// anteponiendo el nombre de la clase.
		// Cuantos metros son 2.5km.
		System.out.println("2.5Km son: " + Unidades.quilometros * 2.5);
		
		// Comprobamos que al cambiar el atributo PI en un objeto se cambia tambien en el otro.
		// Esto se debe a que PI es un atributo estático.
		Unidades u1 = new Unidades();
		Unidades u2 = new Unidades();
		
		u1.PI = 3.1416;
		
		// Al haber cambiado u1.PI también ha cambiado u2.PI .
		// La forma correcta de acceder al atributo estático seria poner delante el
		// nombre de la clase. Unidades.PI .
		System.out.println(u2.PI);

	}

}
