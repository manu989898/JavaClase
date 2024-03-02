package ejemplo06Visibilidad;

import ejemplo07Visibilidad.Persona;

public class Main {

	public static void main(String[] args) {	
		
		// La clase coche está en el mismo paquete que esta clase Main.
		Coche coche1 = new Coche("1000FFF","Renault","Clio");
		 
		// No podemos accerder a coche1.matricula, ya que lo hemos hecho private.
		// coche1.matricula
		
		// Podemos acceder a coche1.marca ya que no tiene ningún modificador. 
		// Tiene visibilidad en todo el paquete.
		coche1.marca = "Mercedes";
		
		// Podemos acceder a coche1.modelo ya que le ehemos puesto un modificador "public".
		// Tiene visibilidad en todo el proyecto.
		coche1.modelo = "Benz";
		
		// La clase persona está en un paquete distinto que esta clase Main.
		// Para poder crear un objeto persona he tenido que poner el constructor como "public".
		Persona persona1 = new Persona();
		
		// No podemos acceder a persona1.apellidos ya que lo hemos hecho "private".
		
		// No podemos acceder a persona1.nombre ya que al no tener modificados solo se puede usar en el paquete.
		
		// En este caso deja ya que es public y lo hemos importado.
		persona1.dni = "43567890P";
	}

}
