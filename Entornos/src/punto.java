
public class punto {

	private double x;
	private double y;

	public punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void Punto() {
		
	}
	
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distancia(punto p) {
		return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
	}

	public boolean equals(punto p) {
		if (p.x == x && p.y == y) {
			return true;
		} else {
			return false;
		}
	}

}
