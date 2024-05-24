package lanchonete.atendimento;

public class Atendente {
    public void servirMesa() {

        System.out.println("Atendendo a mesa");
        pegarLancheCozinha();
    }
    private void pegarLancheCozinha() {
        System.out.println("Pegando o lanche da cozinha");
    }
    public void receberPagamento() {
        System.out.println("Recebendo o pagamento");
    }
    void trocarGas() {
        System.out.println("Atendente trocando o gás");
    }
    private void pegarPedidoNoBalcao() {
        System.out.println("Atendente pegando o pedido no balcão");
    }
}
