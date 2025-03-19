package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem via Telegram");
        salvarHistoricoMensagens();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Telegram");
        salvarHistoricoMensagens();
    }
}
