package Pagamento;

public class EstrategiaPagamentoCartao implements EstrategiaPagamento{
    @Override
    public boolean processar(Pagamento pagamento) {
        return true;
    }
}
