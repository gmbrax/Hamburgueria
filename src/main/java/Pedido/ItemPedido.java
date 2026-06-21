package Pedido;

import Cardapio.Produto;

import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
    private Produto produto;
    private List<Modificacao> modificacoes = new ArrayList<>();

    public ItemPedido(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getSubtotal(){
        double soma = this.produto.getPrecoBase();
        for (Modificacao mod : this.modificacoes) {
            soma += mod.custo();
        }
        return soma;
    }

    public void aplicarModificacao(Modificacao mod){
        this.modificacoes.add(mod);
        mod.executar();
    }

    public void desfazerUltima(){
        if (!modificacoes.isEmpty()) {
            Modificacao ultima = modificacoes.get(modificacoes.size() - 1);
            ultima.cancelar();
            modificacoes.remove(modificacoes.size() - 1);
        }
    }

}
