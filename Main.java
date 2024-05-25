public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros("12345", 0.05);
        cuentaAhorros.consignar(1000);
        System.out.println("Saldo cuenta de ahorros: " + cuentaAhorros.consultarSaldo());
        System.out.println("Intereses cuenta de ahorros: " + cuentaAhorros.calcularIntereses());

        CuentaCorriente cuentaCorriente = new CuentaCorriente("67890", 500);
        cuentaCorriente.consignar(500);
        System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(800);
        System.out.println("Saldo cuenta corriente después de retirar: " + cuentaCorriente.getSaldo());

        Bono bono = new Bono(1000);
        System.out.println("Saldo del bono: " + bono.consultarSaldo());
        System.out.println("Intereses del bono: " + bono.calcularIntereses());
    }
}
