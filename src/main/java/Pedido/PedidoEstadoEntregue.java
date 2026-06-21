package Pedido;

public class PedidoEstadoEntregue extends PedidoEstado{

    private static PedidoEstadoEntregue instance;

    private PedidoEstadoEntregue(){}

    public static PedidoEstadoEntregue getInstance(){
        if(instance == null){
            instance = new PedidoEstadoEntregue();
        }
        return instance;
    }

    @Override
    public boolean finalizar(Pedido pedido){
        pedido.setEstado(PedidoEstadoFinalizado.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }
}
