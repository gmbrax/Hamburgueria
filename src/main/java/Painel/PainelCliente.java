package Painel;

import java.util.Observable;

public class PainelCliente extends Painel{

    @Override
    public void update(Observable o, Object estado) {
        this.ultimaNotificacao = "CLIENTE: pedido mudou para " + estado;
    }
}
