package apps;

public class FacebookMenssenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem via Facebook Messenger");
        salvarHistoricoMensagens();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Facebook Messenger");
        salvarHistoricoMensagens();
    }
}
