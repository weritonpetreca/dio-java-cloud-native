package apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println("Enviando mensagem: " + mensagem + " via Telegram");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Telegram");
        salvarHistoricoMensagens();
    }
}
