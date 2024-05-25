public abstract class Cuenta {
    private String numero;
    protected double saldo;

    public Cuenta(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    public abstract boolean retirar(double cantidad);
}
