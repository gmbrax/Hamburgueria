package Autorizacao;

public class AutorizadorCozinha extends Autorizador{
    @Override
    protected boolean souResponsavelPor(AcaoPedido acao) {
        return acao == AcaoPedido.INICIAR_PREPARO || acao == AcaoPedido.DEFINIR_PRONTO;
    }

    @Override
    protected PapelFuncionario meuPapel() {
        return PapelFuncionario.COZINHA;
    }
}
