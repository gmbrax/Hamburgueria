package Pedido;

public class PedidoEstadoRascunho extends PedidoEstado{

    private static PedidoEstadoRascunho instance;

    private PedidoEstadoRascunho() {}

    public static PedidoEstadoRascunho getInstance() {
        if (instance == null) {
            instance = new PedidoEstadoRascunho();
        }
        return instance;
    }

    public boolean confirmar(Pedido pedido){
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.criarPagamento();
        return true;
    }

    public boolean cancelar(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }


    @Override
    public String getEstado() {
        return "Rascunho";
    }

}
