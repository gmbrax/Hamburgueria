package Pedido;

import Cardapio.Produto;
import Cardapio.Ingrediente;

public class AdicionarIngrediente implements Modificacao {
    private Produto produto;
    private Ingrediente ingrediente;

    public AdicionarIngrediente(Produto produto, Ingrediente ingrediente){
        this.produto = produto;
        this.ingrediente = ingrediente;
    }

    @Override
    public void executar() {
        this.produto.AddIngredientes(ingrediente);
    }

    @Override
    public void cancelar() {
        this.produto.removeIngrediente(ingrediente);
    }

    @Override
    public String descricao() {
        return "EXTRA " + ingrediente.getNome();
    }

    @Override
    public double custo() {
        return ingrediente.getPrecoAdicional();
    }
}