package apps;

public abstract  class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    void salvarHistoricoMensagens() {
        System.out.println("Salvando histórico de mensagens");
    }

}
