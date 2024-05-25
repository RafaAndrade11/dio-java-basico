public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo FacebookMessenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FacebookMessenger");
    }
}

