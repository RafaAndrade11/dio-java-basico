import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaDeInteiros;

    public OrdenacaoNumeros() {
        this.listaDeInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(this.listaDeInteiros);
        if (!listaDeInteiros.isEmpty()) {
            Collections.sort(listaAscendente);
            return listaAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(this.listaDeInteiros);
        if (!listaDeInteiros.isEmpty()) {
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaDeInteiros=" + listaDeInteiros +
                '}';
    }

}
