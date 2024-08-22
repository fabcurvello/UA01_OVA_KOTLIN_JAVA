package poo;

public class Pagamento {
    public static void main(String[] args) {
        PagavelJava cartao = new CartaoCreditoJava();
        PagavelJava boleto = new BoletoJava();

        cartao.processarPagamento(150);
        boleto.processarPagamento(200);
    }
}
