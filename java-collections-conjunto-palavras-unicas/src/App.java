public class App {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("AVIÃO");
        conjuntoPalavrasUnicas.adicionarPalavra("CARRO");
        conjuntoPalavrasUnicas.adicionarPalavra("MOTO");
        conjuntoPalavrasUnicas.adicionarPalavra("DENTE");
        conjuntoPalavrasUnicas.adicionarPalavra("MORCEGO");
        conjuntoPalavrasUnicas.adicionarPalavra("VIAGEM");
        conjuntoPalavrasUnicas.adicionarPalavra("LOUCURA");

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("CaRrO"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("ONIBUS"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("viageM"));

        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());

        conjuntoPalavrasUnicas.removerPalavra("MORCEgo");
        conjuntoPalavrasUnicas.removerPalavra("motO");

        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());

    }
}
