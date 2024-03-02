package ejemplo09CocheGetters;

import java.util.Scanner;

public class Coche {

	// Propiedades de cada coche.
	private String matricula;
	private String marca;
	private String modelo;
	private String averia;
	int quilometros;
	
	// Constructor implícito
	public Coche(){
		
	}
	
	// Constructor explícito que tome los 5 valores de los atributos
	Coche(String matricula, String marca, String modelo, String averia, int quilometros){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;
	}
	
	// Constructor explicíto que tome matricula, marca y modelo.
	public Coche(String matricula, String marca, String modelo){
		
		/*  lo mismo es escribir esto que lo de abajo.
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo; 
		*/
		this(matricula, marca, modelo, null, 0);
	}
	
	
	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde consola.
	public void leeDatos() {
		Scanner escaner = new Scanner(System.in);
		System.out.println("INTRODUCCIÓN DE DATOS EN EL SISTEMA");
		
		System.out.println("Matricula: ");
		matricula = escaner.nextLine();
	
		System.out.println("Marca: ");
		marca = escaner.nextLine();
		
		System.out.println("Modelo: ");
		modelo = escaner.nextLine();
		
		System.out.println("Averia: ");
		averia = escaner.nextLine();
		
		System.out.println("Quilometros:");
		quilometros = escaner.nextInt();
		
	}
	
	
	public void mostrar() {
		System.out.println("\n*** DATOS DEL VEHÍCULO ***");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Averia: " + averia);
		System.out.println("KM: " + quilometros);
	}

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("ELIMINANDO OBJETO DE LA MEMORIA");
	}
	
	//Getters y Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		
		//Comprobamos que los quilometros no sean un número negativo
		if(quilometros < 0) {
			return;
		}
		
		this.quilometros = quilometros;
	}
	

}


	