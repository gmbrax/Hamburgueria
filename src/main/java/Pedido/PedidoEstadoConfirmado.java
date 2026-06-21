package Pedido;

public class PedidoEstadoConfirmado extends PedidoEstado{

    private static PedidoEstadoConfirmado instance;
    private PedidoEstadoConfirmado(){}

    public static PedidoEstadoConfirmado getInstance(){
        if(instance == null){
            instance = new PedidoEstadoConfirmado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Confirmado";
    }

    public boolean aguardarPagamento(Pedido pedido){
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
