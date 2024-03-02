package biblioteca;

public class Libro {

	// ---- VARIABLES ----
	
	private String titulo;
	private String isbn;
	// Le creamos una variable autor de tipo Autor.
	private Autor autor;
	private static int anioActual;
	
	
	
	
	// ---- CONSTRUCTORES ----
	
	// Creamos constructor pedido por el ejercicio.
	public Libro(String titulo) {
		
		this.titulo = titulo;
	}
	
	// Creamos constructor pedido por el ejercicio.
	public Libro(String titulo, String isbn, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	
	}
	
	public String toString() {
		
		//Titulo, isbn, nombre autor, anioActual.
		return "Título: " + titulo + ", ISBN: " + isbn +
				"\n, Nombre autor: " + autor.getNombre();
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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
