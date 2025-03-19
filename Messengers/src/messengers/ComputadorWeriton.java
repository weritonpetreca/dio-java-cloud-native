package messengers;
import apps.FacebookMenssenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorWeriton {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*Não se sabe qual App
          Mas qualquer um deverá enviar e receber mensagens
         */
        String appEscolhido = "tlg";

        switch (appEscolhido) {
            case "tlg" -> smi = new Telegram();
            case "msn" -> smi = new MSNMessenger();
            case "fbm" -> smi = new FacebookMenssenger();
            default -> {
            }
        }
        if (smi != null) {
            smi.enviarMensagem();
            smi.receberMensagem();
        } else {
            System.out.println("Selecione um aplicativo de mensagem válido");
        }
    }
}
