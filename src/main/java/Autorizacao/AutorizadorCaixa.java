package Autorizacao;

public class AutorizadorCaixa extends Autorizador {
    @Override
    protected boolean souResponsavelPor(AcaoPedido acao) {
        return acao == AcaoPedido.PAGAR;
    }


    @Override
    protected PapelFuncionario meuPapel() {
        return PapelFuncionario.CAIXA;
    }
}