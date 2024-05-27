import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SomaNumeros listaDeNumeros = new SomaNumeros();

        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(4);
        listaDeNumeros.adicionarNumero(6);
        listaDeNumeros.adicionarNumero(7);
        listaDeNumeros.adicionarNumero(1);

        System.out.println("A soma dos números é igual: " + listaDeNumeros.calcularSoma());
        System.out.println("O maior número é: " + listaDeNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + listaDeNumeros.encontrarMenorNumero());
        System.out.println(listaDeNumeros.exibirNumeros());
    }
}
