public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("Tocando música pelo reprodutor musical do Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo reprodutor musical do Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Escolhendo musica para ser tocada no reprodutor musical do Iphone: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo aparelho telefonico do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo aparelho telefonico do Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz pelo aparelho telefonico do Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina pelo navegador de internet do Iphone: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo navegador de internet do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo navegador de internet do Iphone");
    }
}
