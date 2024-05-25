import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item i : itensList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itensList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public String calcularValorTotal() {
        double valorTotal = 0;
        for (Item i: itensList) {
            valorTotal = valorTotal + i.getPreco();
        }
        return ("O valor total do preço dos itens é: " + valorTotal);
    }
    public void exibirItens() {
        System.out.println(itensList);
    }

}
