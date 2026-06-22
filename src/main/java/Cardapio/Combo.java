package Cardapio;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemCardapio {
    private String nome;
    private List<ItemCardapio> itens;

    public Combo(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        this.itens.add(item);
    }

    @Override
    public double getPreco() {
        double soma = 0;
        for (ItemCardapio item : itens) {
            soma += item.getPreco();   // RECURSÃO: soma os componentes
        }
        return soma;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}