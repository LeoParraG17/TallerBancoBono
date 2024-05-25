public class Bono implements Rentable {
    private double saldo;
    private double interes;

    public Bono(double saldo) {
        this.saldo = saldo;
        this.interes = 0.10;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public double calcularIntereses() {
        return saldo * interes;
    }
}