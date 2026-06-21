package Pagamento;

public class EstrategiaPagamentoPix implements EstrategiaPagamento{
    @Override
    public boolean processar(Pagamento pagamento) {
        return true;
    }
}
