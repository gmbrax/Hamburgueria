package Pagamento;

public class EstrategiaPagamentoDinheiro implements EstrategiaPagamento{
    @Override
    public boolean processar(Pagamento pagamento) {
        return true;
    }
}
