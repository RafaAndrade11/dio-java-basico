package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Cozinheiro adicionando lanche no balcao");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Cozinheiro adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao() {
        System.out.println("Cozinheiro adicionando combo no balcao");
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer.");
    }
    private void prepararVitamina() {
        System.out.println("Preparando vitamina.");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIgredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne.");
    }
    private void selecionarIgredientesVitamina() {
        System.out.println("Selecionando fruta, leite e suco.");
    }
    private void lavarIgredientes() {
        System.out.println("Lavando os ingredientes.");
    }
    private void baterVitaminaNoLiquidificador() {
        System.out.println("Batendo a vitamina no liquidificador.");
    }
    private void fritarIgredientesLanche() {
        System.out.println("Fritando os ingredientes do lanche.");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIgredientes(Almoxarife almoxarife) {
        almoxarife.entregarIgredientes();
    }
}
