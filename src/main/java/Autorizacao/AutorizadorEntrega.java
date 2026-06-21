package Autorizacao;

public class AutorizadorEntrega extends Autorizador{
    @Override
    protected boolean souResponsavelPor(AcaoPedido acao) {
        return acao == AcaoPedido.ENTREGAR;
    }

    @Override
    protected PapelFuncionario meuPapel() {
        return PapelFuncionario.ATENDENTE;
    }
}
