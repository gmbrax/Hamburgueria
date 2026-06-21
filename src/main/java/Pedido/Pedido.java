package Pedido;


import com.fasterxml.uuid.Generators;
import java.util.UUID;

import Pagamento.Pagamento;

public class Pedido {
    private UUID id;
    private PedidoEstado estado;
    private Pagamento pagamento = null;

    public Pedido() {
        this.id = Generators.timeBasedGenerator().generate();
        this.estado = PedidoEstadoRascunho.getInstance();
    }

    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }

    public void criarPagamento(){
        this.pagamento = new Pagamento();
    }

    public boolean cancelar(){
        return estado.cancelar(this);
    }

    public boolean confirmar(){
        return estado.confirmar(this);
    }

    public boolean aguardarPagamento(){
        return estado.aguardarPagamento(this);
    }

    public boolean iniciarPreparo(){
        return estado.iniciarPreparo(this);
    }

    public boolean definirPronto(){
        return estado.definirPronto(this);
    }

    public boolean entregar(){
        return estado.entregar(this);
    }

    public boolean finalizar(){
        return estado.finalizar(this);
    }

    public boolean pagar(String formaPagamento){
        return estado.pagar(this,formaPagamento);
    }

    public boolean executarPagamento(String formaPagamento){
        return pagamento.pagar(formaPagamento);
    }

    public boolean executarEstorno() {
        return pagamento.estornar();
    }
}
