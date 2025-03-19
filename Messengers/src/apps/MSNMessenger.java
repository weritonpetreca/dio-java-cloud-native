package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println("Enviando mensagem: " + mensagem + " via MSN");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");
        salvarHistoricoMensagens();
    }
}