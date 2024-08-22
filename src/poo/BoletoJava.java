package poo;

public class BoletoJava implements PagavelJava {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via Boleto.\n",valor);
    }
}
