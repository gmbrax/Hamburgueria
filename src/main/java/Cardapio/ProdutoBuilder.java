package Cardapio;

public class ProdutoBuilder {
    private Produto produto;

    public ProdutoBuilder(String nome, double precoBase, CategoriaProduto categoria){
        this.produto = new Produto(nome, precoBase, categoria);
    }

    public ProdutoBuilder adicionarIngrediente(String nome, double precoAdicional){
        this.produto.AddIngredientes(new Ingrediente(nome,precoAdicional));
        return this;
    }

    public Produto build(){
        if (produto.getIngredientes().isEmpty()) {
            throw new IllegalArgumentException("Produto precisa de ao menos um ingrediente");
        }
        if (produto.getPrecoBase() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        return this.produto;
    }

}
