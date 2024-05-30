public class App {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Futebol", 3);
        contagemPalavras.adicionarPalavra("Basquete", 1);
        contagemPalavras.adicionarPalavra("Volei", 6);
        contagemPalavras.adicionarPalavra("Tenis", 12);
        contagemPalavras.adicionarPalavra("Baseball", 2);

        System.out.println(contagemPalavras.exibirContagemPalavras());

        contagemPalavras.removerPalavra("Basquete");
        contagemPalavras.removerPalavra("Tenis");
        System.out.println(contagemPalavras.exibirContagemPalavras());

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
