package Pedido;

public abstract class PedidoEstado {

    public abstract String getEstado();


    public boolean cancelar(Pedido pedido){
        return false;
    }

    public boolean confirmar(Pedido pedido) {
        return false;
    }

    public boolean aguardarPagamento(Pedido pedido) {
        return false;
    }
    public boolean entregar(Pedido pedido) {
        return false;
    }
    public boolean definirPronto(Pedido pedido) {
        return false;
    }
    public boolean finalizar(Pedido pedido){
        return false;
    }

    public boolean pagar(Pedido pedido, String formaPagamento) {
        return false;
    }

    public boolean estornar(Pedido pedido) {
        return false;
    }

    public boolean iniciarPreparo(Pedido pedido) {
        return false;
    }

    public boolean adicionarItem(Pedido pedido, ItemPedido item) {
        return false;
    }

    public boolean removerItem(Pedido pedido, ItemPedido item) {
            return false;
    }
}
