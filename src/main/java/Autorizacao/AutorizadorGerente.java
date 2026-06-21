package Autorizacao;

public  class AutorizadorGerente extends Autorizador {
    protected boolean souResponsavelPor(AcaoPedido acao) {
        return acao == AcaoPedido.ESTORNAR;
    }
    protected PapelFuncionario meuPapel() {
        return PapelFuncionario.GERENTE;
    }
}