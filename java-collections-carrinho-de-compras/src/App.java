import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.toString());
        carrinhoDeCompras.adicionarItem("Celular", 2400d, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Maquina de Lavar", 3000d, 1);
        carrinhoDeCompras.adicionarItem("Garrafa de Agua", 2d, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Garrafa de Agua");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());


    }
}
