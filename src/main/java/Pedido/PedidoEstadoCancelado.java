package Pedido;

public class PedidoEstadoCancelado extends PedidoEstado{
    private static PedidoEstadoCancelado instance;
    private PedidoEstadoCancelado(){}

    public static PedidoEstadoCancelado getInstance(){
        if(instance == null){
            instance = new PedidoEstadoCancelado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }
}
