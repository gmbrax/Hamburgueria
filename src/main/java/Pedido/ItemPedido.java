package Pedido;

import Cardapio.Produto;

public class ItemPedido {
    private Produto produto;

    public ItemPedido(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getSubtotal(){
        return this.produto.getPrecoBase();
    }
}
