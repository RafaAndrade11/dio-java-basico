public class Computador {
    public static void main(String[] args) {
        /*
         * O usuário não precisa forçar a verificação de conexão com a internet nem salvar as mensagens,
         * o conceito de encapsulamento está aí, ao enviar e receber mensagem, já encapsulamos essas
         * funções para facilitar para o usuário.
         *
         * Encapsular é somente esconder, os métodos existirão e poderão ser solicitados normalmente.
         * Os métodos precisam ser bem declarados e distribuidos de acordo com suas funções.
         *
         */
        Messenger messenger = new Messenger();

        messenger.enviarMensagem();
        messenger.receberMensagem();

        /*
         * Já que o método enviarMensagem() chama outros métodos, por que não colocar tudo junto?
         * Além de aplicar a reusabilidade dos outros métodos para outras funções, o código se
         * tornaria muito extenso, dificultando a manutenção e até mesmo o entendimento do programa.
         */
    }

}
