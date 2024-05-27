import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaDeInteiros;

    public SomaNumeros() {
        this.listaDeInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeInteiros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if (!listaDeInteiros.isEmpty()) {
            for (int i : listaDeInteiros) {
                somaTotal = somaTotal + i;
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {

        if (!listaDeInteiros.isEmpty()) {
        }
        int maiorValor = listaDeInteiros.get(0);
        for (int i : listaDeInteiros) {
            if (i > maiorValor) {
                maiorValor = i;
            }
        }
        return maiorValor;
    }

    public int encontrarMenorNumero() {
        int menorValor = listaDeInteiros.get(0);

        if (listaDeInteiros == null || listaDeInteiros.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (int i : listaDeInteiros) {
                if (i < menorValor) {
                    menorValor = i;
                }
            }
        }
        return menorValor;
    }

    public List<Integer> exibirNumeros() {
        return listaDeInteiros;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaDeInteiros=" + listaDeInteiros +
                '}';
    }
}