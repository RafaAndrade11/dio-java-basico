public class App {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Rafael", 123123l, 6);
        gerenciadorAlunos.adicionarAluno("João", 4556456l, 10);
        gerenciadorAlunos.adicionarAluno("Mario", 766766l, 3);
        gerenciadorAlunos.adicionarAluno("Jairo", 763336l, 8);
        gerenciadorAlunos.adicionarAluno("Valdomiro", 761266l, 2);
        gerenciadorAlunos.adicionarAluno("Juan", 111166l, 9);

        System.out.println(gerenciadorAlunos.exibirAlunos());

        gerenciadorAlunos.removerAluno(123123l);
        System.out.println(gerenciadorAlunos.exibirAlunos());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}
