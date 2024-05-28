import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicas=" + conjuntoPalavrasUnicas +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p: conjuntoPalavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        conjuntoPalavrasUnicas.remove(palavraParaRemover);
    }
    public String verificarPalavra(String palavra) {
        Boolean palavraParaVerificar = false;
        for (String p : conjuntoPalavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaVerificar = true;
                break;
            }
        }
        if (palavraParaVerificar) {
            return ("A palavra está no conjunto!");
        } else {
            return ("A palavra não esta no conjunto!");
        }
    }

    public Set<String> exibirPalavrasUnicas() {
        return conjuntoPalavrasUnicas;
    }
}
