import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Alunos o) {
        return nome.compareToIgnoreCase(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno - nome: " + nome + " - Matricula: " + matricula + " - Nota: "
                + nota + "\n";
    }
}
