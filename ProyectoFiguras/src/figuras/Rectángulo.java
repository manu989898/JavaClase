package figuras;
import java.awt.Color;

public class Rectángulo extends Figura{
private double base;
private double altura;

public Rectángulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}

public double getBase(){
return base;
}

public double getAltura(){
return altura;
}

public void setBase(double base){
this.base = base;
}

public void setAltura(double altura){
this.altura = altura;
}

public double perímetro (){
   return 2 * base + 2 * altura;
}

public double área (){ 
   return base * altura;
}
}