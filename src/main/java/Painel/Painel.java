package Painel;

import java.util.Observable;
import java.util.Observer;

public  abstract  class Painel implements Observer {
    String ultimaNotificacao;


    @Override
    public abstract void update(Observable o, Object estado);

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

}
