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

    public boolean pagar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoPago.getInstance());
        return true;
    }

    public boolean cancelar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoCancelado.getInstance());
        return true;
    }

}
