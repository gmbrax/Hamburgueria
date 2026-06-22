package Painel;

import java.util.Observable;

public class PainelCozinha extends Painel{
    @Override
    public void update(Observable o, Object estado) {
        this.ultimaNotificacao = "COZINHA: pedido mudou para " + estado;
    }
}
