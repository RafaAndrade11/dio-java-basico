public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem...");
        salvarHistoricoMensagem();
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico de mensagem...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet...");
    }

}
