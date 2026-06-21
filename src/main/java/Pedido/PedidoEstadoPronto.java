package Pedido;

public class PedidoEstadoPronto extends PedidoEstado{
    private static PedidoEstadoPronto instance;

    private PedidoEstadoPronto(){}

    public static PedidoEstadoPronto getInstance(){
        if(instance == null){
            instance = new PedidoEstadoPronto();
        }
        return instance;
    }

    @Override
    public boolean entregar(Pedido pedido){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Pronto";
    }
}
