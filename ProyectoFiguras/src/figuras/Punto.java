package figuras;

public class Punto {
private double x;
private double y;

public Punto(){
x = 0;
y= 0;
}

public Punto(double x, double y){
this.x = x;
this.y = y;
}

public Punto(Punto p){
x = p.x;
y = p.y;
}

public double getX(){
return x;
}

public double getY(){
return y;
}

public void setX(double x){
this.x = x;
}

public void setY(double y){
this.y = y;
}

public double distancia(Punto p){
return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
}

public Punto simétrico(){
Punto nuevoP = new Punto (this.x * -1, this.y);	
return nuevoP ;
}

public boolean compara(Punto p){
if (p.x == x && p.y == y)
   return true;
else
   return false;
}

public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}