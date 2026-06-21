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
        Produto produto = this.produtos.get(nome);
        if(produto == null){return null;}
        try{
            return produto.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar produto", e);
        }
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
