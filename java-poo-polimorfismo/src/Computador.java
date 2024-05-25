public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
            Não sabemos qual app será usado, mas qualquer um deverá enviar mensagem
         */

        String appEscolhido = "telegram";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("telegram")) {
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
