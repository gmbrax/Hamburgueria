package Pagamento;

public abstract class PagamentoEstado {

    public abstract String getEstado();

    public boolean pagar(Pagamento pagamento){
        return false;
    };

    public boolean estornar(Pagamento pagamento){
        return false;
    };

    public boolean cancelar(Pagamento pagamento){
        return false;
    };


}
