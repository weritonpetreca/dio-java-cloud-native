package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem via MSN");
        salvarHistoricoMensagens();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");
        salvarHistoricoMensagens();
    }
}