package ejemplo13cuentabancaria;

public class PruebaCuenta {
	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(1000);
		
		System.out.println("Saldo de cuenta: " + cuenta1.obetenerSaldo());
		System.out.println("\nDepositamos 200 mas");
		cuenta1.depositar(200);
		System.out.println("Saldo de cuenta: " + cuenta1.obetenerSaldo());
		System.out.println("Retiramos 100");
		cuenta1.retirar(100);
		System.out.println("Saldo de cuenta: " + cuenta1.obetenerSaldo());
		cuenta1.depositar(100, 10);
		System.out.println("Saldo de cuenta: " + cuenta1.obetenerSaldo());
		cuenta1.retirar(100, 5);
		System.out.println("Saldo de cuenta: " + cuenta1.obetenerSaldo());


		
	}
}
