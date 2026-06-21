package Pagamento;

public class Pagamento {

    private PagamentoEstado estado;

    public Pagamento(){
        this.estado = PagamentoEstadoAguardando.getInstance();
    }

    public void setEstado(PagamentoEstado estado){
        this.estado = estado;
    }

    public boolean pagar(String formaPagamento){
        return estado.pagar(this,formaPagamento);
    }

    public boolean estornar(){
        return estado.estornar(this);
    }

    public boolean cancelar(){
        return estado.cancelar(this);
    }

}
