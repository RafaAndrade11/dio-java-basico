import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefaSet;
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> listaTarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if (t.isTarefaEstaConcluida() == true) {
                listaTarefasConcluidas.add(t);
            }
        }
        return listaTarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> listaTarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if (t.isTarefaEstaConcluida() == false) {
                listaTarefasPendentes.add(t);
            }
        }
        return listaTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaParaMarcarConcluida = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaEstaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaEstaConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

}
