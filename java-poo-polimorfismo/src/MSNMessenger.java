public class MSNMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSNMessenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSNMessenger");
    }
}

