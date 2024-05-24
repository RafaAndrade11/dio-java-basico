package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("Almoxarife controlando entrada dos itens.");
    }
    private void controlarSaida() {
        System.out.println("Almoxarife controlando saida dos itens.");
    }
    void entregarIgredientes() {

        System.out.println("Almoxarife entregando ingredientes.");
        controlarSaida();
    }
    void trocarGas() {
        System.out.println("Almoxarife trocando o gás.");
    }
}
