
public class Ejemplo09 {

	public static void main(String[] args) {
		/*
		Se usa "final" en la constante para que no se pueda modificar.
		Las constantes finals se tienen que nombrar todo en MAYUS concadenadas con "_".
		*/ 
		
		final boolean APTO = false;
		final float PI = 3.1416F;
		final String SALUDO = "Estimado sr/a: ";
		final float GRAVEDAD_TIERRA = 9.8F;
		final int IVA = 21;
		final double TEMPERATURA_DESEADA_CAMARA = -20;
		final double TEMPERATURA_EBULLICION_AGUA = 100;	
		
		/*
		PI = 3.5F;
		Nos da error al escribirlo porque no se puede modificar al ser un final.
		*/
		
		System.out.println("La temperatura de ebullicion del agua son: " + TEMPERATURA_EBULLICION_AGUA + "ºC");
		System.out.println("El iva a plicado sobre el valor añadido es del: " + IVA + "%");
	}

}
