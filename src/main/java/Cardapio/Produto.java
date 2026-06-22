package Cardapio;

import java.util.ArrayList;
import java.util.List;

public class Produto  implements Cloneable, ItemCardapio{
    private String nome;
    private CategoriaProduto categoria;
    private double precoBase;
    private List<Ingrediente> ingredientes;

    public Produto(String nome, double precoBase, CategoriaProduto categoria) {
        this.ingredientes = new ArrayList<>();
        this.categoria = categoria;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public double getPreco() {
        return this.precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void AddIngredientes(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente){
        this.ingredientes.remove(ingrediente);
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto Clone = (Produto) super.clone();
        Clone.ingredientes = new ArrayList<>(this.ingredientes);
        return Clone;
    }
}
