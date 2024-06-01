import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comunente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        //Usa o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá , seja bem vindo!";

        //Usa o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Imprime as saudações geradas com o Method Reference (::)
        listaSaudacoes.forEach(System.out::println);

        //Como o Supplier não aceita nenhum argumento, podemos simplificar desta forma:
        List<String> listaSaudacoesSimplificada = Stream.generate(() -> "Olá, essa é uma saudação simplificada")
                .limit(3)
                .toList();

        listaSaudacoesSimplificada.forEach(System.out::println);
    }
}
