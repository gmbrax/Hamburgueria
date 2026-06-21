package Pedido;

public class PedidoEstadoEmPreparo extends PedidoEstado{
    private static PedidoEstadoEmPreparo instance;

    private PedidoEstadoEmPreparo(){}

    public static PedidoEstadoEmPreparo getInstance(){
        if(instance == null){
            instance = new PedidoEstadoEmPreparo();
        }
        return instance;
    }

    @Override
    public boolean definirPronto(Pedido pedido){
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Em preparo";
    }
}
