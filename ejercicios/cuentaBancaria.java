package programacion.ejercicios;

public class cuentaBancaria {
    private double saldo;

    public cuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("No podés depositar una cantidad negativa.");
        }
    }

    public static void main(String[] args) {
        cuentaBancaria miCuenta = new cuentaBancaria(1000);

        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());

        System.out.println("\n Intentando un depósito");
        miCuenta.depositar(500);
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());

        System.out.println("\nIntentando un depósito");
        miCuenta.depositar(-200);

        System.out.println("Saldo final: $" + miCuenta.getSaldo());
    }
}