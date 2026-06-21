package Pedido;

import Cardapio.Produto;
import Cardapio.Ingrediente;

public class RemoverIngrediente implements Modificacao {
    private Produto produto;
    private Ingrediente ingrediente;

    public RemoverIngrediente(Produto produto, Ingrediente ingrediente){
        this.produto = produto;
        this.ingrediente = ingrediente;
    }

    @Override
    public void executar() {
        this.produto.removeIngrediente(ingrediente);
    }

    @Override
    public void cancelar() {
        this.produto.AddIngredientes(ingrediente);
    }

    @Override
    public String descricao() {
        return "SEM " + ingrediente.getNome();
    }

    @Override
    public double custo() {
        return 0.0;
    }
}