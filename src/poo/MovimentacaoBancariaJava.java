package poo;

public class MovimentacaoBancariaJava {
    public static void main(String[] args) {
        ContaBancariaJava conta = new ContaBancariaJava(1000);
        conta.depositar(500);
        conta.sacar(200);
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
