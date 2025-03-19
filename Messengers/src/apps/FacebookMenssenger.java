package apps;

public class FacebookMenssenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println("Enviando mensagem: " + mensagem + " via Facebook Messenger");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Facebook Messenger");
        salvarHistoricoMensagens();
    }
}
