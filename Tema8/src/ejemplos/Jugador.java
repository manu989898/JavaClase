package ejemplos;


import javax.swing.JFrame;


public class Jugador extends JFrame {
	String nombre;
	String puntuacion;
	
	

	public Jugador() {

	}
	public Jugador(String nombre, String puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

}
