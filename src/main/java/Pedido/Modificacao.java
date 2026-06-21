package Pedido;

public interface Modificacao {
    void executar();
    void cancelar();
    String descricao();
    double custo();
}