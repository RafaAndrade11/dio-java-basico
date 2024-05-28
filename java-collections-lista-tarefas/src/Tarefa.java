import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean tarefaEstaConcluida;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaEstaConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaEstaConcluida() {
        return tarefaEstaConcluida;
    }

    public void setTarefaEstaConcluida(boolean tarefaEstaConcluida) {
        this.tarefaEstaConcluida = tarefaEstaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa - Descrição =" + descricao + "/ Tarefa está concluida?" + tarefaEstaConcluida +
                '\n';
    }


}
