package Pagamento;

public class PagamentoEstadoPago  extends PagamentoEstado{

    private static PagamentoEstadoPago instance = null;
    private PagamentoEstadoPago(){}
    public static PagamentoEstadoPago getInstance(){
        if(instance == null){
            instance = new PagamentoEstadoPago();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pagamento Efetuado";
    }

    public boolean estornar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoEstornado.getInstance());
        return true;
    }

}
