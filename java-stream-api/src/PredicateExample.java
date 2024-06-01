import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * É comunente usada para filtrar os elementos do Stream com base em alguma condição
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "Go", "Ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        //simplificando com lambdas
        palavras.stream().filter(p -> p.length() < 5).forEach(System.out::println);
    }
}