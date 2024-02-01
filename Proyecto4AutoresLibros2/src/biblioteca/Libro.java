package biblioteca;

public class Libro {

	// ---- VARIABLES ----
	
	private String titulo;
	private String isbn;
	// Le creamos una variable autor de tipo Autor.
	private Autor[] autores;
	private static int anioActual;
	
	
	
	
	// ---- CONSTRUCTORES ----
	
	// Creamos constructor pedido por el ejercicio.
	public Libro(String titulo) {
		
		this.titulo = titulo;
	}
	
	// Creamos constructor pedido por el ejercicio.
	public Libro(String titulo, String isbn, Autor[] autores) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	
	}
	
	public String toString() {
		if (autores.length ==1) {
			return "Título: " + titulo + ", ISBN: " + isbn + " Autor: " + autores[0].getNombre();
		} 
		return "Título: " + titulo + ", ISBN: " + isbn + "Autor: " + "Varios autores ";
		//Titulo, isbn, nombre autor, anioActual.
		
	}
	
	
	// ---- GETERS Y SETERS ----

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutor(Autor[] autores) {
		this.autores = autores;
	}

	public static int getAnioActual() {
		return anioActual;
	}
	
	
	// Este set es estatico y vale lo mismo en cualquier objeto Libro
	// Si usamos this.anioActual daria la impresion de que se puede modificar
	// por eso usamos el nombre de la clase: Libro.anioActual.
	public static void setAnioActual(int anioActual) {
		Libro.anioActual = anioActual;
	}
	
	
}
