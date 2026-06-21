package Cardapio;


import java.util.HashMap;
import java.util.Map;

public class Cardapio {

    private static Cardapio instance = null;
    private Map<String,Produto> produtos;

    private Cardapio(){
        this.produtos = new HashMap<>();

    }

    public Produto getProduto(String nome){
        return this.produtos.get(nome);
    }

    public void addProduto(Produto produto){
        this.produtos.put(produto.getNome(),produto);
    }

    public static Cardapio getInstance(){
        if(instance == null){
            instance = new Cardapio();
        }
        return instance;
    }

}
