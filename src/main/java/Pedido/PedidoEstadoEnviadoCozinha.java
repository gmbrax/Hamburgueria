package Pedido;

public class PedidoEstadoEnviadoCozinha extends PedidoEstado{

    private static PedidoEstadoEnviadoCozinha instance;

    private PedidoEstadoEnviadoCozinha(){}

    public static PedidoEstadoEnviadoCozinha getInstance(){
        if(instance == null){
            instance = new PedidoEstadoEnviadoCozinha();
        }
        return instance;
    }

    @Override
    public boolean iniciarPreparo(Pedido pedido){
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        return true;
    }

    @Override
    public boolean estornar(Pedido pedido){
        boolean statusEstorno = pedido.executarEstorno();
        if(statusEstorno){
            pedido.setEstado(PedidoEstadoCancelado.getInstance());
        }
        return statusEstorno;
    }

    @Override
    public String getEstado() {
        return "Enviado Para a Cozinha";
    }

}
