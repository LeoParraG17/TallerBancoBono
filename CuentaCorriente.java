public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(String numero, double cupoSobregiro) {
        super(numero);
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo + cupoSobregiro >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}