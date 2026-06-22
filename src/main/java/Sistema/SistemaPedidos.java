package Sistema;

import Autorizacao.*;
import Painel.PainelCliente;
import Painel.PainelCozinha;
import Pedido.Pedido;
import Pedido.ItemPedido;

public class SistemaPedidos {

    private static SistemaPedidos instance = null;
    private Autorizador correnteAutorizacao;

    private SistemaPedidos(){
        AutorizadorCaixa caixa = new AutorizadorCaixa();
        AutorizadorCozinha cozinha = new AutorizadorCozinha();
        AutorizadorEntrega entrega = new AutorizadorEntrega();
        AutorizadorGerente gerente = new AutorizadorGerente();
        caixa.setProximo(cozinha);
        cozinha.setProximo(entrega);
        entrega.setProximo(gerente);
        this.correnteAutorizacao = caixa;
    }

    public static SistemaPedidos getInstance(){
        if (instance == null) {
            instance = new SistemaPedidos();
        }
        return instance;
    }


    public Pedido criarPedido(){
        Pedido pedido = new Pedido();
        pedido.addObserver(new PainelCozinha());
        pedido.addObserver(new PainelCliente());
        return pedido;
    }

    public boolean iniciarPreparo(Pedido pedido, PapelFuncionario papel){
        if (correnteAutorizacao.autorizar(papel, AcaoPedido.INICIAR_PREPARO)) {
            return pedido.iniciarPreparo();
        }
        return false;
    }

    public boolean pagar(Pedido pedido, PapelFuncionario papel, String forma){
        if (correnteAutorizacao.autorizar(papel, AcaoPedido.PAGAR)) {
            return pedido.pagar(forma);
        }
        return false;
    }

    public boolean definirPronto(Pedido pedido, PapelFuncionario papel){
        if (correnteAutorizacao.autorizar(papel, AcaoPedido.DEFINIR_PRONTO)) {
            return pedido.definirPronto();
        }
        return false;
    }

    public boolean entregar(Pedido pedido, PapelFuncionario papel){
        if (correnteAutorizacao.autorizar(papel, AcaoPedido.ENTREGAR)) {
            return pedido.entregar();
        }
        return false;
    }


    public boolean adicionarItem(Pedido pedido, ItemPedido item){
        return pedido.adicionarItem(item);
    }

    public boolean removerItem(Pedido pedido, ItemPedido item){
        return pedido.removerItem(item);
    }

    public boolean confirmar(Pedido pedido){
        return pedido.confirmar();
    }

    public boolean aguardarPagamento(Pedido pedido){
        return pedido.aguardarPagamento();
    }

    public boolean cancelar(Pedido pedido){
        return pedido.cancelar();
    }

    public boolean estornar(Pedido pedido, PapelFuncionario papel){
        if (correnteAutorizacao.autorizar(papel, AcaoPedido.ESTORNAR)) {
            return pedido.estornar();
        }
        return false;
    }

    public boolean finalizar(Pedido pedido){
        return pedido.finalizar();
    }
}