
public class CuentaCorriente {

}
public getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
public void extraerDinero(double importe) {
    if ((saldo - importe) < 0) {
        throw new java.lang.ArithmeticException("Saldo insuficiente");
    } else {
        saldo -= importe;
    }
}
public void ingresarDinero(double importe) {
    saldo += importe;
}
public void transferirDinero(CuentaCorriente cuentaDestino, double importe) {
    if ((saldo - importe) < 0) {
        throw new java.lang.ArithmeticException("Saldo insuficiente");
    } else {
        saldo -= importe;
        cuentaDestino.ingresarDinero(importe);
    }
}
public void mostrarSaldo() {
    System.out.println("Saldo: " + saldo);
}