
public class Ejemplo10 {

	public static void main(String[] args) {
		/*
		 * byte < short < int < long < float < double (Se puede perder info en float y
		 * double) para cuando un valor excede de tamaño (byte, short, long...)
		 */

		// Conversiones implicitas (no van a dar problemas de desbordamiento).

		byte num = 100;
		short num2 = num;

		// Conversiones explicitas (pueden dar problemas de desbordamiento).

		// En este caso lo prohibe aunque lo puede contener por si acaso.

		short num3 = 100;
		byte num4 = num3;

		// En este caso si ponemos (byte) nos responsabilizamos de cambiarlo.

		short num55 = 100;
		byte num56 = (byte) num55;

		/*
		 * En este caso no da error porque hemos dicho que num3 sea un byte pero el
		 * valor sera de -24 y no 1000 (desbordado)
		 */

		short num85 = 1000;
		byte num86 = (byte) num85;

		// Mas conversiones implicitas.
		long num5 = 10000;
		float num6 = num5;

		float num7 = 5000;
		double num8 = num7;

		// Mas conversiones explicitas. Si queremos corregirla
		double num10 = 500;
		float num11 = num10;
		// Para corregirla hacemos un CAST a float.
		double num12 = 500;
		float num13 = (float) num12;
	}

}
