package ejemplo13cuentabancaria;

public class CuentaBancaria {

	// Asignamos la variable saldo a la clase CuentaBancaria.
	private double saldo;

	public CuentaBancaria(double saldo) {

		this.saldo = saldo;
	}

	// Creamos método que deposite cantidad y la sume al saldo
	public void depositar(double cantidad) {

		saldo = saldo + cantidad;
	}
	
	// Creamos otro método con mismo nombre pero diferente firma (sobrecarga)
		public void depositar(double cantidad, int comision) {
			double cantidadReal = cantidad - comision * cantidad / 100;
			saldo = saldo + cantidadReal;
		}

	// Creamos método que compruebe si es posible reitrar una cantidad.
	// De ser así se restará del saldo.
	public boolean retirar(double cantidad) {

		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		return false;
	}
	
	// Creamos otro método con mismo nombre pero diferente firma (sobrecarga)
		public boolean retirar(double cantidad, int comision) {
			double cantidadReal = cantidad + comision * cantidad / 100;
			if (cantidadReal <= saldo) {
				saldo = saldo - cantidadReal;
				return true;
			}
			return false;
		}

	// Creamos un método que nos devuelva el saldo.
	public double obetenerSaldo() {

		return saldo;
	}

	
	
	

}
