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
        String appEscolhido = "msn";

        if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        } else if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMenssenger();
        }
        smi.enviarMensagem("Ola, Weriton!");
        smi.receberMensagem();
    }
}
