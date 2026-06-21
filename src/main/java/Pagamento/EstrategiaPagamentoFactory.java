package Pagamento;

public class EstrategiaPagamentoFactory {

    public static EstrategiaPagamento obter(String tipo){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("Pagamento.EstrategiaPagamento"+tipo);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Tipo de Pagamento inexistente");
        }
        if (!(objeto instanceof EstrategiaPagamento)){
            throw new IllegalArgumentException("Tipo de Pagamento invalido");
        }
        return (EstrategiaPagamento) objeto;
    }
}
