package Pedido;

public class PedidoEstadoAguardandoPagamento extends PedidoEstado{
    private static PedidoEstadoAguardandoPagamento instance;
    private PedidoEstadoAguardandoPagamento(){}

    public static PedidoEstadoAguardandoPagamento getInstance(){
        if(instance == null){
            instance = new PedidoEstadoAguardandoPagamento();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aguardando Pagamento";
    }

    public boolean cancelar(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean pagar(Pedido pedido){
        boolean statusPagamento =  pedido.executarPagamento();
        if(statusPagamento){
            pedido.setEstado(PedidoEstadoEnviadoCozinha.getInstance());
        }
        return statusPagamento;
    }

}
