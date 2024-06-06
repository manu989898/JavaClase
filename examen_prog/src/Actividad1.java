import java.security.DomainCombiner;

public class Actividad1 {
	
	private static Integer[] numeros = {90,96,110,140,200,215,240,278,290,300};
	static int x = 290;
	static int i = 0;
	static int f = numeros.length -1;
	static int m = (i + f) /2;
	
	public static void main(String[] args) {
		
		
		System.out.println(busquedaBinaria(numeros, m, f, x));
		
		
	}
	
	public static int busquedaBinaria(Integer[] numeros, int m, int f, int x) {
		
		if(f < i) {
			return -1;
		}
		
		
		if(numeros[m] == x) {
			return m;
		}
		
		if(m < x) {
			
			return busquedaBinaria(numeros, m+1, f, x);
			
		}
		return busquedaBinaria(numeros, m-1, f, x);
	}

}
