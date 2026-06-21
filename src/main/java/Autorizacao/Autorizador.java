package Autorizacao;

public abstract class Autorizador {
    private Autorizador proximo;

    public void setProximo(Autorizador proximo){
        this.proximo = proximo;
    }

    public boolean autorizar(PapelFuncionario papel, AcaoPedido acao){
        if (souResponsavelPor(acao)) {
            return papel == meuPapel();        // minha ação → o papel bate?
        } else if (proximo != null) {
            return proximo.autorizar(papel, acao);   // não é minha → passa adiante
        } else {
            return false;                      // ninguém na fila é responsável
        }
    }

    protected abstract boolean souResponsavelPor(AcaoPedido acao);
    protected abstract PapelFuncionario meuPapel();
}