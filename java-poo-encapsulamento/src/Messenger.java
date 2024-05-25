public class Messenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Reccebendo mensagem...");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem...");
    }
}
