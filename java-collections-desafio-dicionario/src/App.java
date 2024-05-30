public class App {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.removerPalavra("Será que consigo remover sem nada cadastrado?");

        dicionario.adicionarPalavra("Bater", "Ato de bater");
        dicionario.adicionarPalavra("Soltar", "Ato de soltar");

        System.out.println(dicionario.exibirPalavras());

        dicionario.removerPalavra("Bater");
        System.out.println(dicionario.exibirPalavras());

        System.out.println(dicionario.pesquisarPorPalavra("Soltar"));

    }
}
