package Pagamento;

public class PagamentoEstadoCancelado extends PagamentoEstado{

    private static PagamentoEstadoCancelado instance = null;

    private PagamentoEstadoCancelado(){}

    public static PagamentoEstadoCancelado getInstance(){
        if(instance == null){
            instance = new PagamentoEstadoCancelado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return " Pagamento Cancelado";
    }
}
