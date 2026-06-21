package Pagamento;

public class PagamentoEstadoEstornado extends PagamentoEstado{

    private static PagamentoEstadoEstornado instance = null;

    private PagamentoEstadoEstornado(){}

    public static PagamentoEstadoEstornado getInstance(){
        if(instance == null){
            instance = new PagamentoEstadoEstornado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pagamento Estornado";
    }
}
