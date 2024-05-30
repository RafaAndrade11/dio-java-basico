import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String , String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Não existem palavras cadastradas ainda.");
        }
    }
    public Map<String, String> exibirPalavras() {
        return dicionarioMap;
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        }
            return palavraPesquisada;
    }

    @Override
    public String toString() {
        return "Dicionario{" +
                "dicionarioMap=" + dicionarioMap +
                '}';
    }
}
