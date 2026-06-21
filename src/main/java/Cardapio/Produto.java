package Cardapio;

import java.util.ArrayList;
import java.util.List;

public class Produto {
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
}
