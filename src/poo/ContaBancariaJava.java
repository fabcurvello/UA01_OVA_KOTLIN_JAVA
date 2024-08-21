package poo;

public class ContaBancariaJava {

    private double saldo;

    public ContaBancariaJava(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

