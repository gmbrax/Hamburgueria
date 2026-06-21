package Pedido;

public class PedidoEstadoFinalizado extends PedidoEstado{
    private static PedidoEstadoFinalizado instance;

    private PedidoEstadoFinalizado(){}

    public static PedidoEstadoFinalizado getInstance(){
        if(instance == null){
            instance = new PedidoEstadoFinalizado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Finalizado";
    }
}
