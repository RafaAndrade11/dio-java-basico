import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        OrdenacaoNumeros listaDeInteiros = new OrdenacaoNumeros();

        listaDeInteiros.adicionarNumero(4);
        listaDeInteiros.adicionarNumero(5);
        listaDeInteiros.adicionarNumero(2);
        listaDeInteiros.adicionarNumero(6);
        listaDeInteiros.adicionarNumero(3);
        listaDeInteiros.adicionarNumero(9);
        listaDeInteiros.adicionarNumero(7);

        System.out.println("A lista ascendente é: " + listaDeInteiros.ordenarAscendente());
        System.out.println("A lista descendente é: " + listaDeInteiros.ordenarDescendente());
    }
}
