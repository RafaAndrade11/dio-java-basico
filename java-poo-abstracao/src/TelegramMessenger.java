public class TelegramMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo TelegramMessenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo TelegramMessenger");
    }
}

