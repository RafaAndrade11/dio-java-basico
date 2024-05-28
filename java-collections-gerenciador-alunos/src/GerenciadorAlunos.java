import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Alunos alunoParaRemover = null;
        for (Alunos a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoParaRemover);
    }
    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> listaAlunosPorNome = new TreeSet<>(alunosSet);
        return listaAlunosPorNome;
    }
    public Set<Alunos> exibirAlunosPorNota() {
        Set<Alunos> listaAlunosPorNota = new TreeSet<>(new ComparatorPorPreco());
        listaAlunosPorNota.addAll(alunosSet);
        return listaAlunosPorNota;
    }

    public Set<Alunos> exibirAlunos() {
        return alunosSet;
    }
}
