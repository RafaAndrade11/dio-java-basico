public class App {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.adicionarTarefa("Limpar fogão");
        listaTarefas.adicionarTarefa("Arrumar armário");
        listaTarefas.adicionarTarefa("Escovar os dentes");
        listaTarefas.adicionarTarefa("Ir para o trabalho");

        System.out.println(listaTarefas.exibirTarefas());

        listaTarefas.removerTarefa("Arrumar armário");
        System.out.println(listaTarefas.exibirTarefas());

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaConcluida("Limpar fogão");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.exibirTarefas());
    }
}
