package inicio;

import auxiliar.Grupo;

public class Inicio {

	public static void main(String[] args) {
		
		// Leer datos de la clase
		System.out.println("*** LEER DATOS DE LA CLASE ***");
		Grupo grupo1 = new Grupo();
		grupo1.leeDatos();
		System.out.println(grupo1.toString());
	}

}
