package poo;

public class CartaoCreditoJava implements PagavelJava {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via Cartão de Crédito.\n",valor);
    }
}
