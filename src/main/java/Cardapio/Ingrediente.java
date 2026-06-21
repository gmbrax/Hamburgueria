package Cardapio;

public class Ingrediente {
    private String nome;
    private double precoAdicional;

    public Ingrediente(String nome, double precoAdicional){
        this.nome = nome;
        this.precoAdicional = precoAdicional;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }
}
