public class CuentaAhorros extends Cuenta implements Rentable {
    private double interes;

    public CuentaAhorros(String numero, double interes) {
        super(numero);
        this.interes = interes;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    @Override
    public double calcularIntereses() {
        return saldo * interes;
    }
}
