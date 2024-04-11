package doc;

/**
 * Clase que nos da la información y calculos sobre puntos.
 * 
 * @author El Gran Pablo Lopez VIII
 * @since 12/2/2020
 * @version 11/5/2020
 */

public class Punto {
	
	/**
	 * Posición en el eje X del objeto tipo Punto
	 */
	private double x;
	
	/**
	 * Posición en el eje Y del objeto tipo Punto
	 */
	private double y;
	
	/**
	 * Este constructor nos permite crear un punto pasandole la posición X e Y
	 */
	public Punto() {
		x = 0;
		y = 0;
	}
	
	/**
	 * 
	 * @param x Nos indica la posición de un punto ne el eje X
	 * @param y Nos indica la posición de un punto ne el eje Y
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto p) {
		x = p.x;
		y = p.y;
	}
	
	/**
	 * Getter del atributo X
	 * 
	 * @return el valor de X
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter del atributo Y
	 * 
	 * @return el valor de Y
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Setter del atributo X
	 * 
	 * @param x Nos permite darle un valor al atributo X
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Setter del atributo Y
	 * 
	 * @param y Nos permite darle un valor al atributo Y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Método que nos calcula la distancia entre dos puntos
	 * 
	 * @param p Es un objeto de tipo Punto con su posición X e Y
	 * 
	 * @return Nos devuelve la distancia entre los dos puntos que comparamos.
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
	
	/**
	 * Este método nos permite crear un punto simétrico en el eje X, (modo espejo).
	 * 
	 * @return devuelve el nuevo punto simétrico
	 */
	public Punto simétrico() {
		Punto nuevoP = new Punto(this.x * -1, this.y);
		return nuevoP;
	}

	/**
	 * Compara si los dos puntos están en la misma posición.
	 * 
	 * @param p Es un objeto tipo Punto.
	 * @return True si están en la misma posición y False si no lo están.
	 */
	public boolean compara(Punto p) {
		if (p.x == x && p.y == y)
			return true;
		else
			return false;
	}
	
	/**
	 * Este método nos imprime las posiciones de un objeto tipo Punto. 
	 * 
	 */
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}