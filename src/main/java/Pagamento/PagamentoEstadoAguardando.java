package Pagamento;

public class PagamentoEstadoAguardando  extends PagamentoEstado{

    private static PagamentoEstadoAguardando instance = null;

    private PagamentoEstadoAguardando(){}

    public static PagamentoEstadoAguardando getInstance(){
        if(instance == null){
            instance = new PagamentoEstadoAguardando();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aguardando Pagamento";
    }

    public boolean pagar(Pagamento pagamento, String formaPagamento){
        EstrategiaPagamento estrategia = EstrategiaPagamentoFactory.obter(formaPagamento);
        boolean statusPagamento = estrategia.processar(pagamento);
        if(statusPagamento){
            pagamento.setEstado(PagamentoEstadoPago.getInstance());
        }
        return statusPagamento;
    }

    public boolean cancelar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoCancelado.getInstance());
        return true;
    }

}
